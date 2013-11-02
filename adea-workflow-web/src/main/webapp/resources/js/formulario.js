function checaSubServicio(xhr, status, args) {

}
function ocultaPrioriodadYDocumento(){
	oculta("labelDocumento,documento,labelPrioridad,prioridad");
	desHabilita("prioridad,documento");
}
function muestraPrioriodadYDocumento(){
	muestra("labelDocumento,documento,labelPrioridad,prioridad");
	habilita("prioridad,documento");
}

function oculta( objsToHide ) {
	var objs = objsToHide.split(",");
	for ( var i=0 ; i < objs.length; i++ ){
		var x= document.getElementById ( "form"+ ":" + objs[i]  );
		jQuery(x).hide("slow");
	}
}

function muestra( objsToHide ) {
	var objs = objsToHide.split(",");
	for ( var i=0 ; i < objs.length; i++ ){
		var x= document.getElementById ( "form"+ ":" + objs[i]  );
		jQuery(x).show("medium");
	}
}

function desHabilita( objsToDisable ) {
	var objs = objsToDisable.split(",");
	for ( var i=0 ; i < objs.length; i++ ){
		var x= document.getElementById ( "form"+ ":" + objs[i]  );
		jQuery(x).attr('disabled','-1');
	}
} 

function habilita( objsToDisable ) {
	var objs = objsToDisable.split(",");
	for ( var i=0 ; i < objs.length; i++ ){
		var x= document.getElementById ( "form"+ ":" + objs[i]  );
		jQuery(x).removeAttr('disabled');
	}
} 

(function($){
	ocultarTiposClientes = function () {
		oculta("labelTipoCliente,tipoCliente");
		desHabilita("tipoCliente");
	};
	mostrarTiposClientes = function () {
		muestra("labelTipoCliente,tipoCliente");
		habilita("tipoCliente");
	};

	ocultarSucursales = function () {
		oculta("labelSucursal,sucursal");
		desHabilita("sucursal");
	};
	mostrarSucursales = function () {
		muestra("labelSucursal,sucursal");
		habilita("sucursal");
	};

	ocultarSubservicios = function () {
		oculta("labelSubServicio,subServicio");
		desHabilita("subServicio");
	};
	mostrarSubservicios = function () {
		muestra("labelSubServicio,subServicio");
		habilita("subServicio");
	};

	ocultarPrioridades = function () {
		oculta("labelPrioridad,prioridad");
		desHabilita("prioridad");
	};
	mostrarPrioridades = function () {
		muestra("labelPrioridad,prioridad");
		habilita("prioridad");
	};

	ocultarDocumentos = function () {
		oculta("labelDocumento,documento");
		desHabilita("documento");
	};
	mostrarDocumentos = function () {
		muestra("labelDocumento,documento");
		habilita("documento");
	};

	ocultarComentarios = function () {
		oculta("labelComentarios,comentarios");
		desHabilita("comentarios");
	};

	mostrarComentarios =function () {
		muestra("labelComentarios,comentarios");
		habilita("comentarios");
	};
})(jQuery);

var contexto ;
var TRADE = 10;  //variable que define el flujo para TRADE
var TRANFERENCIAPAGOS =  9;  //c
var EXITENSUBSERVICIOS = false;
var nav4 = window.Event ? true : false;


/*
		 funcion para saber que valor fue seleccionado en un select
 */
function buscaValorSelecionado ( select) {
	var indicecomboz = select.selectedIndex;
	return select.options[indicecomboz].value;

}



/*Funciones con para mostrar los cambioos con Ajax*/

function getDatosPaises( ) {
	document.getElementById('form:tipoCliente').selectedIndex=0;
	document.getElementById('form:subServicio').selectedIndex=0;
	limpiaInputs();
}

function getDatosSucursales( ) {
	
	var comboServicio2 = document.getElementById('form:servicio');
	var indicecombo2 = comboServicio2.selectedIndex;
	var valorServicio2 = comboServicio2.options[indicecombo2].value;
	if ( valorServicio2 == TRADE ){
		ocultarSucursales();		
	} else {	
			mostrarSucursales();

	}
	document.getElementById('form:tipoCliente').selectedIndex=0;
	limpiaInputs();
}

function getDatosSubServicio( ) {

	var haySubServicios = document.getElementById("form:haySubServicios");
	if (haySubServicios.value == "true" ) {
		mostrarSubservicios();
		EXITENSUBSERVICIOS= true;
		
	}else{
		ocultarSubservicios();
		EXITENSUBSERVICIOS= false;
	}
	document.getElementById('form:tipoCliente').selectedIndex=0;
	limpiaInputs();
}


function getDatosDocumentos( ) {
	var hayDocumentos = document.getElementById("form:hayDocumentos");

	if (hayDocumentos.value == "true" ) {
		muestraPrioriodadYDocumento();	
	}else{
		ocultaPrioriodadYDocumento();
	}
}

function getDatosPrioridades( ) {
	var hayPrioridades = document.getElementById("form:hayPrioridades");

	if (hayPrioridades.value == "true" ) {
		muestraPrioriodadYDocumento();	
	}else{
		ocultaPrioriodadYDocumento();
	}
	
}



function  obtenValoresXServicio ( ){
	var comboServicio = document.getElementById('form:servicio');
	var indicecombo = comboServicio.selectedIndex;
	var valorServicio = comboServicio.options[indicecombo].value;

	if (valorServicio >0 ){
		getDatosPaises();
		getDatosSubServicio();

		if ( valorServicio == TRADE )  
		{
			ocultarTiposClientes();
			muestraPrioriodadYDocumento();
			mostrarComentarios();
			ocultarSucursales();
		} else{
			if ( valorServicio  == TRANFERENCIAPAGOS ) {
				ocultarComentarios();
			}else{
				mostrarComentarios();
			}
			mostrarTiposClientes();
			mostrarSucursales();
			ocultarPrioridades();
			ocultarDocumentos();
		} 
		limpiaInputs();
		document.getElementById('form:pais').selectedIndex=0;
		document.getElementById('form:sucursal').selectedIndex=0;
		document.getElementById('form:tipoCliente').selectedIndex=0;
		document.getElementById('form:documento').selectedIndex=0;
		document.getElementById('form:prioridad').selectedIndex=0;  
	}
}





function validaForma(form){

	//campos select
	var selectDocumentos = document.getElementById('form:documento');	
	var selectTipoCliente = document.getElementById('form:tipoCliente');	
	var selectPrioridad = document.getElementById('form:prioridad');	
	var selectSubservicio = document.getElementById('form:subServicio');	
	var selectSucursal = document.getElementById('form:sucursal');	
	var selectPais = document.getElementById('form:pais');	
	var selectServicio = document.getElementById('form:servicio');	

	var botonSubmit = document.getElementById('form:botonSubmit');	
	//var form = document.getElementById('form');	

	var servicio;

	if ( valida_select(selectServicio)){
		servicio =  buscaValorSelecionado(selectServicio);

		if (!valida_select(selectPais)){
			alert('Favor de seleccionar un país.');
			selectPais.focus();
			return;
		}

		if (servicio == TRADE){
			if (!valida_select(selectSubservicio)){
				alert('Favor de seleccionar un subservicio.');
				selectSubservicio.focus();
				return;
			}
			if (!valida_select(selectPrioridad)){
				alert('Favor de seleccionar una prioridad.');
				selectPrioridad.focus();
				return;
			}
			if (!valida_select(selectDocumentos)){
				alert('Favor de seleccionar un documento.');
				selectDocumentos.focus();
				return;
			}

			if (!validaInputsYTextArea()) {
				return;
			} 

		}else {

			if (!valida_select(selectSucursal)){
				alert('Favor de seleccionar una sucursal.');
				selectSucursal.focus();
				return;
			}
			if (!valida_select(selectTipoCliente)){
				alert('Favor de seleccionar un tipo de cliente.');
				selectTipoCliente.focus();
				return;
			}

			if ( EXITENSUBSERVICIOS ){
				if (!valida_select(selectSubservicio)){
					alert('Favor de seleccionar un subservicio.');
					selectSubservicio.focus();
					return;
				}
			}

			if (servicio == TRANFERENCIAPAGOS){
				if (!validaInputs()) {
					return;
				}
			}else {
				if (!validaInputsYTextArea()) {
					return;
				}
			}

		}	

	} else{
		alert("Favor de seleccionar un servicio.");
		selectServicio.focus();
		return;
	}		
	//contexto= document.getElementById('contexto').value + "/";
	botonSubmit.disabled=true;
	//form.action =    contexto + "ServiciosLAM";
	form.submit();

};


function validaInputs(){
	alert("llego al metodo valida input");
	var inputMailEjecutivo = document.getElementById('form:mailEjecutivo');
	var inputNombreEjecutivo = document.getElementById('form:nombreEjecutivo');
	var inputNomCliente = document.getElementById('form:nombreCliente');	
	var inputNumCliente = document.getElementById('form:numeroCliente');	
	
	if ( ! validaCampo ( inputMailEjecutivo ) ){
		alert('Favor de ingresar su correo en el campo Correo del Ejecutivo.');
		inputMailEjecutivo.focus();
		return false;
	}else{
		if ( validaCorreo ( inputMailEjecutivo.value ) ){
			alert('Formato de correo incorrecto, Favor de validar');
			inputMailEjecutivo.focus();
			return false;
		}
	}

	if ( ! validaCampo ( inputNombreEjecutivo ) ){
		alert('Favor de ingresar su nombre en el campo Nombre del Ejecutivo.');
		inputNombreEjecutivo.focus();
		return false;
	}
	if ( ! validaCampo ( inputNomCliente ) ){
		alert('Favor de ingresar el Número de Cliente.');
		inputNomCliente.focus();
		return false;
	}
	if ( ! validaCampo ( inputNumCliente ) ){
		alert('Favor de ingresar el Número de Cliente.');
		inputNumCliente.focus();
		return false;
	}

	return true;
};



function validaOperador(){

	var inputOperator = document.getElementById('form:operator');	
	if ( ! validaCampo ( inputOperator ) ){
		alert('Favor de ingresar su número de usuario para realizar la operacion.');
		inputOperator.focus();
		return false;
	}else {
		var long = inputOperator.value.length;
		if (  (long < 6) || (long > 8)  ){
			alert('EL número de usuario es incorrecto.');
			inputOperator.focus();
			return false;
		}

	}

	return true;
}



function validaInputsYTextArea(){
	//var inputComentarios = document.getElementById('comentarios');

	var x = validaInputs() ;

	if ( x ){

	}else{
		return false;
	}

	return true;
};





function valida_select ( select){
	if  (select.selectedIndex == 0 )
		return false;
	return true;
};


function vacio(campo) {
	for (var i=0; i<campo.length; i++) {
		if (campo.charAt(i) != " ") {
			return true;
		}
	}
	return false;
}
function validaCampo (texto) {
	if (vacio(texto.value) == false)
		return false;
	return true;
}

/***************
 * 
 *  Parte para el manejo del archivo Si se quiere en otra pagina 
 * 
 * ****/	

function valida () {
	var file = document.getElementById( 'file' );  

	var sExtension="";
	var sNombreArchivo="";

	if (!validaCampo(file) == true) {
		alert('Debe seleccionar un archivo a adjuntar, por favor verifique.');
		file.focus();
		return false;
	} 

	sNombreArchivo = file.value;
	sNombreArchivo = sNombreArchivo.substring(sNombreArchivo.lastIndexOf('\\') + 1, sNombreArchivo.length);

	if(sNombreArchivo.length > 20){
		alert('La longitud del nombre del archivo excede los 20 caracteres');
		return false;
	}
	//.-_1234567890ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz
	if (! /^\w+([\.-_]?\w+)+$/.test(sNombreArchivo) ){
		alert('Nombre de archivo invalido, el nombre no debe incluir caracteres especiales &, /, <, >, \\, etc.');
		return false;
	}

	if(sNombreArchivo.search("\\.\\.") != -1 ){
		alert("Nombre de archivo invalido. No debe contener '.' consecutivos");
		return false;
	}

	sExtension=generaExtensionArchivo(file.value).toUpperCase();

	if(sExtension=='PDF' || sExtension=='TIF' || sExtension=='JPEG' || sExtension=='JPG' || sExtension=='GIF' || sExtension=='BMP' || sExtension=='TIFF'){
		return true;
	} else {
		alert('El archivo a subir debe tener extension .pdf, .tif, .tiff, .jpg, .jpeg, .bmp, .gif. Por favor verifique.');
		file.focus();
		return false;
	}



}

function generaExtensionArchivo(sNomArchivo) {
	var sExtension = "";

	while(true) {
		if(sNomArchivo.lastIndexOf('.') == -1) {
			sExtension = sNomArchivo;
			break;
		} else {
			sNomArchivo = sNomArchivo.substring(sNomArchivo.lastIndexOf('.') +  1, sNomArchivo.length);			
		}
	}	
	return sExtension;
}


function revisar(){
	var boton = document.getElementById('botonSubmit');
	var form = document.getElementById('form');
	boton.style.display = "none";
	if(!valida()){
		boton.style.display = "block";
	}else{
		var contexto= document.getElementById('contexto').value + "/";
		form.action =    contexto + "ServiciosLAM";
		form.submit();
	}
}	


function limpiaInputs(){
	document.getElementById('form:nombreCliente').value="";	
	document.getElementById('form:numeroCliente').value="";	
	document.getElementById('form:comentarios').value ="";
}


