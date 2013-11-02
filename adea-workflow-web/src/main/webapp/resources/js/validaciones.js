/**
variable para el manejo de eventos en navegadores
*/
var nav4 = window.Event ? true : false;


function validaCorreo(correo) {
    if (/^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/.test(correo))
        return false;
    else 
        return true;
};

function acceptCaracterCorreo(evt){	
    var key = nav4 ? evt.which : evt.keyCode;	
    return (key <= 13 || (key >= 48 && key <= 57) || (key >= 64 && key <= 90)||(key >= 97 && key <= 122) || (key == 45) || (key == 95) || (key == 46)  );
}


function acceptNum(evt){	
    var key = nav4 ? evt.which : evt.keyCode;	
    return (key <= 13 || (key >= 48 && key <= 57));
}

function acceptLetras(evt){	
    var key = nav4 ? evt.which : evt.keyCode;
    return (key <= 13 || (key > 64 && key <= 90)||(key >= 97 && key <= 122) || (key == 32) || (key == 164) ||(key == 165) ||(key == 241) ||(key == 209) );
}


function acceptLetrasYNumeros(evt){	
    var key = nav4 ? evt.which : evt.keyCode;
    return (key <= 13 || (key >= 48 && key <= 57) || (key > 64 && key <= 90)||(key >= 97 && key <= 122) || (key == 32) || (key == 164) ||(key == 165) ||(key == 241) ||(key == 209) );
}

function bloqueaEscritura(evt){	
	   var key = nav4 ? evt.which : evt.keyCode;	
	   return (key < -1) ;
	}