/**
 * CONSTRUCTOR
 */
LoginForm = function LoginForm(cfg){
    this.IU = "LOGIN-FORM";
    LIC(this,cfg);  
    this.create();
}
/**
 * CREATE
 */
LoginForm.prototype.create=function(){
    Ext.QuickTips.init();
    Ext.form.HtmlEditor.prototype.msgTarget = 'slide';  
    /*** USER NAME ***/
    this.lbUserName  = new Ext.form.Label({
        text            : lng.label.username,
        style           : "font-size: 15px;color:#ffffff;font-weight: bold;",
        x               : 100,
        y               : 200
    });
    this.txtUserName = new Ext.form.TextField({
        own             : this,        
        name            : "j_username",        
        style           : "opacity:0.40;font-size: 15px;color: #2a6b99;font-weight: bold;",
        x               : 100,
        y               : 225,
        width           : 395,
        height          : 30,
        allowBlank      : false,
        minLength       : 4,        
        validationDelay : 50,
        validateOnBlur  : true
    });
    
    /*** PASSWORD ***/
    this.lbPassword  = new Ext.form.Label({
        text            : lng.label.password,
        style           : "font-size: 15px;color:#ffffff;font-weight: bold;",
        x               : 100,
        y               : 270        
    });   
    this.txtPassword = new Ext.form.TextField({
        own             : this,       
        name            : "j_password",        
        inputType       : "password",        
        style           : "opacity:0.40;font-size: 15px;color: #2a6b99;font-weight: bold;",
        x               : 100,
        y               : 295,
        width           : 395,
        height          : 30,
        allowBlank      : false,
        minLength       : 4,        
        validationDelay : 50,        
        validateOnBlur  : true
    });

    /*** BUTTON***/
    this.btnLogin = new Ext.Button({
        own       : this,
        disabled  : true,
        text      : lng.button.label.login,
        iconCls   : "icon-unlock",
        style     : "opacity:0.70;font-size: 15px;color: #2a6b99;font-weight: bold;",
        x         : 405,
        y         : 345,
        width     : 90,
        height    : 35,
        handler   : function(){
            if (this.own!=null){
                this.own.doLogin();
            }
        }
    });
    this.sealVerisignHtml = '<object id="s_l" align="" width="130" height="88" codebase="https://download.macromedia.com/pub/shockwave/cabs/flash/swflash.cab#version=5,0,0,0" classid="clsid:D27CDB6E-AE6D-11cf-96B8-444553540000">'+
							'<param value="https://seal.verisign.com/getseal?at=1&sealid=0&dn=www.adea.com.mx&lang=es" name="movie">'+
							'<param value="false" name="loop">'+
							'<param value="false" name="menu">'+
							'<param value="best" name="quality">'+
							'<param value="transparent" name="wmode">'+
							'<param value="always" name="allowScriptAccess">'+
							'<embed align="" width="130" height="88" allowscriptaccess="always" pluginspage="https://www.macromedia.com/go/getflashplayer" type="application/x-shockwave-flash" name="s_l" swliveconnect="FALSE" wmode="transparent" quality="best" menu="false" loop="false" src="https://seal.verisign.com/getseal?at=1&sealid=0&dn=www.adea.com.mx&lang=es">'+
							'</object>';
    this.sealVerisign = {
				x     : 250,
				y     : 450,
	            xtype : 'label',
	            html  : ((typeof this.isVerisign=='undefined')||(!this.isVerisign))?'':this.sealVerisignHtml
	           };
     	           
    /*** FORM ***/
    this.form = new Ext.FormPanel({
        own         : this,
        //title       : "AdeA Central Authentication Service",
        renderTo    : Ext.getBody(),
        style       : "padding:16px;background-image: url("+context+"/images/login_background.png);background-repeat: no-repeat;",
        bodyStyle   : "background:transparent;",
        headerStyle : "background:transparent;font-size: 19px;color:#ffffff;font-weight: bold;",        
        width       : 630,
        height      : 570,
        border      : false,
        labelAlign  : "top",
        layout      : "absolute",
        items       :[this.lbUserName,this.lbPassword,this.txtUserName,this.txtPassword,this.btnLogin,this.sealVerisign]
    });
    this.form.el.center();
    this.initForm();
}
/**
 * DESTROY
 */
LoginForm.prototype.destroy=function(){
    delete loginForm;
    delete LoginForm;
}

/**
 * INIT FORM
 */
LoginForm.prototype.initForm=function(){
   
    this.txtUserName.on("change",function(){
        this.own.doBusinessLogic();
    });
    this.txtUserName.on("specialkey",function(f,e){		
        if ((e.getKey() == e.ENTER)&&(f.isValid())){
		   f.nextSibling().focus();
		   f.own.doBusinessLogic();
		}
    });  
    this.txtPassword.on("change",function(){
        this.own.doBusinessLogic();
    });
    this.txtPassword.on("specialkey",function(f,e){		
        if ((e.getKey() == e.ENTER)&&(f.isValid())){
		   f.nextSibling().focus();
		   f.own.doBusinessLogic();
		}
    });
    this.doBusinessLogic();
    this.txtUserName.focus();
}

/**
 * CLOSE
 */
LoginForm.prototype.doClose=function(){
    this.wnd.close();
    delete loginForm;
    dmsDesktopApplication = null;
    delete dmsDesktopApplication;
    delete lng;
    delete Ajax;
    delete CHS;
    delete File;
    window.close();
}
/**
 * LOGIN
 */
LoginForm.prototype.doLogin=function(){
    this.form.getForm().submit({
		own:this,
       timeout:timeoutGeneric(),
        url:context+"/j_spring_security_check",
        waitTitle:lng.window.title.waiting,
        waitMsg:lng.msg.information.initializing,
        success:function(form, action){
		form.reset();
		if(typeof action.result.secureAccess=="undefined"){
			Ext.Msg.alert("Error!", "Tipo de acceso sin definir.",function(){
				  form.own.txtUserName.focus();	
			});
		}else if(!action.result.secureAccess){
		//	window.location = context+"/welcome.jspx";
                Ext.Msg.alert("you are out");
		}else{
                  //  form.own.wnd.setDisabled(true);
			window.location = context+"/home.xhtml";
		}        
        },
        failure:function(form, action){	
			form.reset();		
            if(action.failureType == "server"){
                obj = Ext.util.JSON.decode(action.response.responseText);
                Ext.Msg.alert("Error!", obj.message,function(){
				  form.own.txtUserName.focus();	
				});                
            }else{
                Ext.Msg.alert("Atencion!", "Authentication server is unreachable : " + action.response.responseText,function(){
				  form.own.txtUserName.focus();	
				});
            }          
            form.own.doBusinessLogic();
        }
    });
}
/**
 * BUSINESS LOGIC
 */
LoginForm.prototype.doBusinessLogic=function(){
    this.btnLogin.setDisabled( (!this.txtUserName.validate()) || (!this.txtPassword.validate()) );
}

/**
 * 
 */
LoginForm.prototype.doSecureAccess=function(){
   this.wnd = new Ext.Window({
        iconCls  : "icon-key",
        title    : "Acceso Seguro",
        closable : false,
        resizable: false,
        modal    : true,
        draggable: false,
        width    : 200,
        //height   : 150,
        plain    : true        
    });        
	
	this.captcha = new Ext.ux.Image({	
		labelStyle : "font-size: 15px;color:#610700;font-weight: bold;",    
		fieldLabel : "Posicion"
		});	
	this.eDigits = new Ext.form.TextField({
        own             : this,
        labelStyle      : "font-size: 15px;color:#610700;font-weight: bold;",    
        fieldLabel      : "Digito",   
        name            : "digits",
        inputType       : "password",
        allowBlank      : false,
        width			: 50,       
        minLength       : 3,
        maxLength       : 3,
        validationDelay : 50,
        validateOnBlur  : true
    });
	this.btnSecureAccess = new Ext.Button({
        own       : this,  
        disabled  : true,     
        text      : "Comprobar",
        iconCls   : "icon-security-warning-16x16",        
        height    : 30,         
        handler   : function(){
            if (this.own!=null){
                this.own.doCheckCaptcha();
            }
        }
    });
    this.eDigits.on("change",function(){
      this.own.doBusinessLogicSecureAccess();
    });    
   
    this.secureAccessForm = new Ext.FormPanel({	
		own       : this,  	
        frame:true,      
        bodyStyle:"padding:5px 5px 0",        
        items: [this.captcha,this.eDigits],
        buttons:[this.btnSecureAccess]       
		});
    
    this.wnd.add(this.secureAccessForm);
    this.doLoadCaptcha();
    this.wnd.show();    
}

LoginForm.prototype.doLoadCaptcha=function(){	
    Ext.Ajax.request({
        own:this,
        timeout:timeoutGeneric(),
        url: "security/access/captcha.action",
        success: function(rs,rq){
            rs =  RTJO(rs);
            if(!rs.success){
               msgFailure(rs.message,function(){
                        window.location = 'j_spring_security_logout';
                    });
            }else{			   
               rq.own.captcha.setSrc(rs.data.captcha);
               rq.own.secureAccessForm.getForm().reset();
            }
        },
        failure: function(rs,rq){
            Ext.MessageBox.hide();
            rs =  RTJO(rs);
            msgFailure(rs.statusText,function(){
				window.location = 'j_spring_security_logout';
				});
        }
    }); 
}

LoginForm.prototype.doCheckCaptcha=function(){
   this.secureAccessForm.getForm().submit({
		own:this,
        timeout:timeoutGeneric(),
        url:"security/access/check.action",
        waitTitle:lng.window.title.waiting,
        waitMsg:lng.msg.information.initializing,
        success:function(form, action){
		form.reset();
		form.own.doBusinessLogicSecureAccess();		
		if(typeof action.result.data.allowAccess=="undefined"){
			Ext.Msg.alert("Error!", "Error desconocido.");
		}else if(!action.result.data.allowAccess){
		  form.own.doLoadCaptcha();				
		  Ext.Msg.alert("Error!", "El d\355gito no coincide con la posici\363n.");
		}else{
			form.own.wnd.setDisabled(true);
			window.location = "main.jsp";
		}
        },
        failure:function(form, action){	
			form.reset();		
			form.own.doBusinessLogicSecureAccess();
            if(action.failureType == "server"){
                obj = Ext.util.JSON.decode(action.response.responseText);
                Ext.Msg.alert("Error!", obj.message);
            }else{
                Ext.Msg.alert("Atencion!", "Authentication server is unreachable : " + action.response.responseText);
            }
        }
    });
}
LoginForm.prototype.doBusinessLogicSecureAccess=function(){
	this.btnSecureAccess.setDisabled(!this.secureAccessForm.getForm().isValid());
}





