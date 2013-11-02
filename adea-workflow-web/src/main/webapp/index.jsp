<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1252; lang=es">
        <meta http-equiv="Access-Control-Allow-Origin" content="*"/>
        <title>ADEAWEBMX :: AdeA México S.A. de C.V. :: INICIO DE SESION</title>
        <!-- STYLES -->
        <link rel="stylesheet" type="text/css" href="http://www.adea.com.mx/shared/js/libs/ext-3.3.1/resources/css/ext-all.css" />
        <link rel="stylesheet" type="text/css" href="http://www.adea.com.mx/shared/css/commons.css"/>

        <%String contextPath = request.getContextPath();%>
          <script type="text/javascript">
             var context = "<%=contextPath%>";
        </script>
        
        <style type="text/css">

            .div-login-css{
                width: 630pogin-cssx;
                height: 470px;
                background-position:center;
                background-repeat:no-repeat;
                background-image: url( http://www.adea.com.mx/shared/img/desktop/wallpapers/login_background.png );
                margin-right:auto;
                margin-left:auto;
                margin-bottom:auto;
                width:640px;
            }
            .style1 { background-image:url( http://www.adea.com.mx/shared/img/desktop/wallpapers/aero-blue-abstract-wallpaper.jpg );
                      background-repeat:repeat
            }
        </style>
        <!-- LIBS -->
        <script type="text/javascript" src="http://www.adea.com.mx/shared/js/libs/ext-3.3.1/adapter/ext/ext-base.js"></script>
        <script type="text/javascript" src="http://www.adea.com.mx/shared/js/libs/ext-3.3.1/ext-all-debug-adea.js"></script>
        <!-- LIBS CODICENTRO -->
        <script type="text/javascript" src="http://www.adea.com.mx/shared/js/libs/codicentro/locales/com.codicentro.locale.es.js"></script>
        <script type="text/javascript" src="http://www.adea.com.mx/shared/js/libs/codicentro/com.codicentro.system.js"></script>
        <script type="text/javascript" src="http://www.adea.com.mx/shared/js/libs/codicentro/com.codicentro.ext.js"></script>
        <script type="text/javascript" src="http://www.adea.com.mx/shared/js/libs/codicentro/com.codicentro.utils.js"></script>        
        <!-- EXT-LIBS-UX -->
        <script type="text/javascript" src="http://www.adea.com.mx/shared/js/libs/ext-ux/Image.js"></script>
        <!-- ADEA LIBS -->
        <script type="text/javascript" src="http://www.adea.com.mx/shared/js/libs/adea/commons/ctrl.js"></script>
        <script type="text/javascript" src="http://www.adea.com.mx/shared/js/libs/adea/locales/adea-es.js"></script>
        <!-- ADEADMS-LIBS -->
        <script type="text/javascript" src="<%=request.getContextPath()%>/js/LoginSpringSecurityV1.3.js"></script>
        <!-- MISC -->
        <script type="text/javascript" src="http://www.adea.com.mx/shared/js/libs/ext-3.3.1/src/locale/ext-lang-es.js"></script>
        <script type="text/javascript" src="http://www.adea.com.mx/shared/js/libs/SealVerisign.js"></script>
    </head>
    <body id="docbody" class="style1">  
          <script type="text/javascript">new LoginForm({isVerisign:true});</script> 
<!--<form class="div-login-css" name='frm' action="<%=request.getContextPath()%>/j_spring_security_check" method='post' >

		<table class="div-login-css"  >
				
			<tr bgcolor="red" align="center" >
				<td colspan='2'> <h2> <font color='white' face="Arial" > <fmt:message key="msg.frm.titulo.login" /> </font> </h2> </td>
			</tr>
 						
			<tr>
				<td colspan='2'> <br/> </td>
			</tr>
			
			<tr>
				<td colspan='2'> <br/> </td>
			</tr>
			
			<tr>
				<td align="right" > <font color='black' face='Arial' size='2' > <fmt:message key="msg.frm.usuario" />: </font> </td>
				<td> <input type='text' name='j_username' value='' /> </td>
			</tr>
			
			<tr>
				<td align="right" > <font color='black' face='Arial' size='2' > <fmt:message key="msg.frm.password" />: </font> </td>
				<td> <input type='password' name='j_password'/> </td>
			</tr>
	 
			<tr>
				<td colspan='2'> <br/> </td>
			</tr>
			
			<tr>
				<td colspan='2'> <br/> </td>
			</tr>
			
			<tr align="center" >
				<td colspan='2' >
				    <input name='PROCESAR' type='submit' value='<fmt:message key="msg.frm.boton.procesar" />' />			            
				    <input name='LIMPIAR'  type='reset'  value='<fmt:message key="msg.frm.boton.limpiar"  />' />
				</td>
			</tr>
			
			<tr>
				<td colspan='2'> <br/> </td>
			</tr>
			
			<tr>
				<td colspan='2'> <br/> </td>
			</tr>
			
		</table>

	</form>-->
	     
    </body>
</html>
