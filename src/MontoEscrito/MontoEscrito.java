package MontoEscrito;

import com.sun.istack.internal.NotNull;

public class MontoEscrito {
	
	public String ValorLetras(String cadena) {
		
		String letras1="";
		String letras2="";
		String letras3="";
		String letras4="";
		String digito1="";
		String digito2="";
		String valorletras="";
		String complemento="Y";
				
		//if (cadena.substring(1,2).equals("0") & cadena.substring(2,3).equals("0")) complemento="";
		
		//if (cadena.substring(2,3).equals("0")) complemento="";
		
		if (cadena.length() == 1) {
			cadena="000" + cadena;
			complemento="";
		}
		
		if (cadena.length() == 2) cadena="00" + cadena;
		
		if (cadena.length() == 3) cadena="0" + cadena;
		
		digito1=cadena.substring(0, 1);
				
		switch (digito1) {
				
			case "1": letras1="MIL";
					
			break;
				
			case "2": letras1="DOSMIL";
				
			break;	
			
			case "3": letras1="TRESMIL";
			
			break;
				
			case "4": letras1="CUATRO";
				
			break;
			
			case "5": letras1="CINCOMIL";
			
			break;
			
			case "6": letras1="SEISMIL";
			
			break;
				
			case "7": letras1="SIETEMIL";
				
			break;	
			
			case "8": letras1="OCHOMIL";
			
			break;
				
			case "9": letras1="NUEVEMIL";
				
			break;
			
			case "0": letras1="";
			
			break;


			default:
				break;
		}
		
		digito1=cadena.substring(1, 2);
		
		switch (digito1) {
		
			case "1": if (cadena.substring(2, 3).equals("0") & cadena.substring(3, 4).equals("0")) {
							letras2="CIEN";
							complemento="";
					} else letras2="CIENTO";
			
					
			break;
				
			case "2": if (cadena.substring(2, 3).equals("0") & cadena.substring(3, 4).equals("0")) {
							letras2="DOSIENTOS";
							complemento="";
					} else letras2="DOSIENTOS";
				
			break;	
			
			case "3": if (cadena.substring(2, 3).equals("0") & cadena.substring(3, 4).equals("0")) {
							letras2="TRECIENTOS";
							complemento="";
					} else letras2="TRECIENTOS";
			
			break;
				
			case "4": if (cadena.substring(2, 3).equals("0") & cadena.substring(3, 4).equals("0")) {
							letras2="CUATROCIENTOS";
							complemento="";
					} else letras2="CUATROCIENTOS";
				
			break;
			
			case "5": if (cadena.substring(2, 3).equals("0") & cadena.substring(3, 4).equals("0")) {
							letras2="QUINIENTOS";
							complemento="";
					} else letras2="QUINIENTOS";
			
			break;
			
			case "6": if (cadena.substring(2, 3).equals("0") & cadena.substring(3, 4).equals("0")) {
							letras2="SEISCIENTOS";
							complemento="";
					} else letras2="SEISCIENTOS";
			
			break;
				
			case "7": if (cadena.substring(2, 3).equals("0") & cadena.substring(3, 4).equals("0")) {
							letras2="SETECIENTOS";
							complemento="";
					} else letras2="SETECIENTOS";
				
			break;	
			
			case "8": if (cadena.substring(2, 3).equals("0") & cadena.substring(3, 4).equals("0")) {
							letras2="OCHOCIENTOS";
							complemento="";
					} else letras2="OCHOCIENTOS";
			
			break;
				
			case "9": if (cadena.substring(2, 3).equals("0") & cadena.substring(3, 4).equals("0")) {
							letras2="NOVECIENTOS";
							complemento="";
						} else letras2="NOVECIENTOS";
				
			break;
			
			case "0": letras2="";
			
			break;
	
	
			default:
				break;
		}
		
		digito1=cadena.substring(2, 3);
		digito2=cadena.substring(3, 4);
		
		switch (digito1) {
		
			case "1":{ 
				
				if (digito2.equals("1")) letras3="ONCE";
				if (digito2.equals("2")) letras3="DOCE";
				if (digito2.equals("3")) letras3="TRECE";
				if (digito2.equals("4")) letras3="CATORCE";
				if (digito2.equals("5")) letras3="QUINCE";
				if (digito2.equals("6")) letras3="DIEZ";
				if (digito2.equals("7")) letras3="DIEZ";
				if (digito2.equals("8")) letras3="DIEZ";
				if (digito2.equals("9")) letras3="DIEZ";
				if (digito2.equals("0")) letras3="DIEZ";
				
			}
		    
		    break;
		
			case "2": letras3="VEINTE";
				
			break;	
			
			case "3": letras3="TREINTA";
			
			break;
				
			case "4": letras3="CUARENTA";
				
			break;
			
			case "5": letras3="CINCUENTA";
			
			break;
			
			case "6": letras3="SESENTA";
			
			break;
				
			case "7": letras3="SETENTA";
				
			break;	
			
			case "8": letras3="OCHENTA";
			
			break;
				
			case "9": letras3="NOVENTA";
				
			break;
			
			case "0": letras3="";
			
			break;
	
	
			default:
				break;
		}
		
		switch (digito2){
		
		    case "1": if (digito1.equals("1")) letras4=""; else letras4="UNO";
		    
		    break;
			
			case "2": if (digito1.equals("1")) letras4=""; else letras4="DOS";
				
			break;	
			
			case "3": if (digito1.equals("1")) letras4=""; else letras4="TRES";
			
			break;
				
			case "4": if (digito1.equals("1")) letras4=""; else letras4="CUATRO";
				
			break;
			
			case "5": if (digito1.equals("1")) letras4=""; else letras4="CINCO";
			
			break;
			
			case "6": letras4="SEIS";
			
			break;
				
			case "7": letras4="SIETE";
				
			break;	
			
			case "8": letras4="OCHO";
			
			break;
				
			case "9": letras4="NUEVE";
				
			break;
			
			case "0": if (cadena.substring(2, 3).equals("0") & cadena.substring(3, 4).equals("0")) {
							letras4=""; 
							complemento="";
							
					} else complemento="";
			
			break;
	
	
			default:
				break;
		}
			
			
			
		if (! letras1.isEmpty()) valorletras=letras1;
		if (! letras2.isEmpty()) valorletras=letras1 + " " + letras2;
		if (! letras3.isEmpty()) valorletras=letras1 + " " + letras2 + " "  + letras3;
		if (! letras4.isEmpty()) valorletras=letras1 + " " + letras2 + " "  + letras3 + " " + complemento + " " + letras4;
		
	
		return valorletras;
	}

}
