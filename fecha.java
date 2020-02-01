package fecha;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.Locale;


import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class fecha {
	
	String newdate;
	String diax;
	int diafenero02;
	int diafebrero;
	int diamarzo;
	int diamarzok;
	int diamarzon;
	int diamarzot;
	int diamarzod;
	int diaabrilf;
	int diaprobacion=31;
	int min;
	int minabrilmayo;
	int minmayo;
	int diaabrilmayo;
	int diamayo;
	String abril22;
	String abril23;
	String abril24;
	String abril25;
	String abril26;
	String abril27;
	String abril28;
	String abril29;
	String abril30;
	int diamayofes;
	int diamayonor;
        int minjunio;
        int maxjunio;
        int diajunion;
        int diajuniof01;

	@SuppressWarnings("unused")
	public void generafechaauto() throws ParseException {
		 ObservableList<Integer> diasmes= FXCollections.observableArrayList();
		 ObservableList<Integer> marzoN= FXCollections.observableArrayList();
		 ObservableList<Integer> marzoabril= FXCollections.observableArrayList();
		 ObservableList<String> abrilmayo= FXCollections.observableArrayList();
		 ObservableList<Integer> abrilmayo2= FXCollections.observableArrayList();
		 ObservableList<Integer> mayo= FXCollections.observableArrayList();
		 ObservableList<Integer> junio= FXCollections.observableArrayList();
		 ObservableList<Integer> febrerof= FXCollections.observableArrayList();
		    
		 junio.addAll(5,6,7,8,9,10,11,12,13,14);
		 diasmes.addAll(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31);
	         febrerof.addAll(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29);
		 marzoN.addAll(13,14,15,16,17,18,19,20,21,22);
		 marzoabril.addAll(31);
	         abrilmayo.addAll("2020-04-22","2020-04-23","2020-04-24","2020-04-25","2020-04-26","2020-04-27","2020-04-28","2020-04-29","2020-04-30");//capturar en bd
	         abrilmayo2.addAll(22,23,24,25,26,27,28,29,30);
	         mayo.addAll(15,16,17,18,19,20,21,22,23,24);
	         min = Collections.min(marzoN);
	         minabrilmayo = Collections.min(abrilmayo2);
		 minmayo=Collections.min(mayo);
		 minjunio=Collections.min(junio);
		 maxjunio=Collections.max(junio);
		Calendar calendarioactual = new GregorianCalendar();  
		SimpleDateFormat formateo = new SimpleDateFormat("yyyy-MM-dd");
		formateo.setCalendar(calendarioactual);
		String date =formateo.format(calendarioactual.getTime());
		
		int año = calendarioactual.get(Calendar.YEAR);
		int mes = calendarioactual.get(Calendar.MONTH);
		
		int mesactual= mes+1;
		
		
		String fechaaprobacion="2020-06-06";//pasar textfield
		Calendar nuevocalendario = new GregorianCalendar();  
		nuevocalendario = Calendar.getInstance();
		try {
			nuevocalendario.setTime(formateo.parse(fechaaprobacion));
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
   	String fechaaproformateada = formateo.format(nuevocalendario.getTime());
        java.util.Date mifecha = new SimpleDateFormat("yyyy-MM-dd").parse(fechaaprobacion);//-------mifecha
   	int añoaprobacion=nuevocalendario.get(Calendar.YEAR);
   	int mesaprobacion=nuevocalendario.get(Calendar.MONTH);
   	int diaaprobacion=nuevocalendario.get(Calendar.DAY_OF_MONTH);
   	int mesfinalaprobacion=mesaprobacion+1;
   	diax=nuevocalendario.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.SHORT, Locale.getDefault());
	
	for (int x=0; x<marzoN.size();x++) {
		   if(marzoN.get(x)==min) {
			 diamarzon=min;
		  }
		 
	}

		
		        Calendar enerofestivo1 = new GregorianCalendar();
	   		enerofestivo1.set(Calendar.YEAR, 2020);
	   		enerofestivo1.set(Calendar.MONTH, 00);
	   		enerofestivo1.set(Calendar.DAY_OF_MONTH, 1); 
	   		
	   		
	   		Calendar enerofestivo2 = new GregorianCalendar();
	   		enerofestivo2.set(Calendar.YEAR, 2020);
	   		enerofestivo2.set(Calendar.MONTH, 00);
	   		enerofestivo2.set(Calendar.DAY_OF_MONTH, 6); 
	   		int mesenero=enerofestivo1.get(Calendar.MONTH);
	   		int diaenero01=enerofestivo1.get(Calendar.DAY_OF_MONTH); 
	   		int diaenero02=enerofestivo2.get(Calendar.DAY_OF_MONTH); 
	   		int mesEne=mesenero+1;
	   		
	   		
	   		Calendar febrero = new GregorianCalendar();
	   		febrero.set(Calendar.YEAR, 2020);
	   		febrero.set(Calendar.MONTH, 01);
	   		int mesfebrero=febrero.get(Calendar.MONTH);
	   		int mesFeb=mesfebrero+1;
	   		
	   		Calendar marzofestivo1 = new GregorianCalendar();
	   		marzofestivo1.set(Calendar.YEAR, 2020);
	   		marzofestivo1.set(Calendar.MONTH, 02);
	   		marzofestivo1.set(Calendar.DAY_OF_MONTH, 23); 
	   		int mesmarzo=marzofestivo1.get(Calendar.MONTH);
	   		int diamarzo01=marzofestivo1.get(Calendar.DAY_OF_MONTH); 
	   		int mesMar=mesmarzo+1;
	   		 
	   	
	   		
	   		Calendar abrilfestivo01 = new GregorianCalendar();
	   		abrilfestivo01.set(Calendar.YEAR, 2020);
	   		abrilfestivo01.set(Calendar.MONTH, 03);
	   		abrilfestivo01.set(Calendar.DAY_OF_MONTH, 9); 
	   		
	   		
	   		Calendar abrilfestivo02 = new GregorianCalendar();
	   		abrilfestivo02.set(Calendar.YEAR, 2020);
	   		abrilfestivo02.set(Calendar.MONTH, 03);
	   		abrilfestivo02.set(Calendar.DAY_OF_MONTH, 10); 
	   		int mesabril=abrilfestivo01.get(Calendar.MONTH);
	   		int diaabril01=abrilfestivo01.get(Calendar.DAY_OF_MONTH); 
	   		int diaabril02=abrilfestivo02.get(Calendar.DAY_OF_MONTH); 
	   		int mesAbril=mesabril+1;
	   		
	  
	   		
	   		Calendar mayofestivo01 = new GregorianCalendar();
	   		mayofestivo01.set(Calendar.YEAR, 2020);
	   		mayofestivo01.set(Calendar.MONTH, 04);
	   		mayofestivo01.set(Calendar.DAY_OF_MONTH, 1); 
	   	        String fechamayo1=formateo.format(mayofestivo01.getTime());
	   		
	   	    //----------------calculo de fechas para comparar string fechas mayo----------------------//
	     	        Calendar xmayo = new GregorianCalendar();
	   		java.util.Date fecha1 = new SimpleDateFormat("yyyy-MM-dd").parse(fechaaproformateada);
			java.util.Date fecha2 = new SimpleDateFormat("yyyy-MM-dd").parse(fechamayo1); 
		        long DateDiference = fecha2.getTime() - fecha1.getTime();
			int diasdiferencia=  (int) (DateDiference / (24* 1000 * 60 * 60));
		        xmayo.add(Calendar.DATE,diasdiferencia);
			String finaldate=formateo.format(xmayo.getTime());	
			String mifechaf1 = formateo.format(fecha1);
			String mifechaf2 = formateo.format(mifecha);
			//-----------fin calculo de fechas para comparar string fechas mayo----------------------//
	   		
	   		Calendar mayofestivo02 = new GregorianCalendar();
	   		mayofestivo02.set(Calendar.YEAR, 2020);
	   		mayofestivo02.set(Calendar.MONTH, 04);
	   		mayofestivo02.set(Calendar.DAY_OF_MONTH, 25); 
	   		int mesmayo=mayofestivo01.get(Calendar.MONTH);
	   		int diamayo01=mayofestivo01.get(Calendar.DAY_OF_MONTH); 
	   		int diamayo02=mayofestivo02.get(Calendar.DAY_OF_MONTH); 
	   		int mesMAyo=mesmayo+1;
	   		

	   		
	   		Calendar juniofestivo01 = new GregorianCalendar();
	   		juniofestivo01.set(Calendar.YEAR, 2020);
	   		juniofestivo01.set(Calendar.MONTH, 05);
	   		juniofestivo01.set(Calendar.DAY_OF_MONTH, 15); 
	   		String fechajunio1=formateo.format(juniofestivo01.getTime());
	   		
	   	   //----------------calculo de fechas para comparar string fechas junio----------------------//
	     	        Calendar xjunio = new GregorianCalendar();
	   		java.util.Date fechajun1 = new SimpleDateFormat("yyyy-MM-dd").parse(fechaaproformateada);
			java.util.Date fechajun2 = new SimpleDateFormat("yyyy-MM-dd").parse(fechajunio1); 
		        long DateDiferencejun = fechajun2.getTime() - fechajun1.getTime();
			int diasdiferenciajun=  (int) (DateDiferencejun / (24* 1000 * 60 * 60));
		        xjunio.add(Calendar.DATE,diasdiferenciajun);
			String finaldatejun=formateo.format(xjunio.getTime());	
			String mifechafjun1 = formateo.format(fechajun1);
			String mifechafjun2 = formateo.format(mifecha);
			//-----------fin calculo de fechas para comparar string fechas junio----------------------//
	   		
	   		Calendar juniofestivo02 = new GregorianCalendar();
	   		juniofestivo02.set(Calendar.YEAR, 2020);
	   		juniofestivo02.set(Calendar.MONTH, 05);
	   		juniofestivo02.set(Calendar.DAY_OF_MONTH, 22); 
	   		
	   		Calendar juniofestivo03 = new GregorianCalendar();
	   		juniofestivo03.set(Calendar.YEAR, 2020);
	   		juniofestivo03.set(Calendar.MONTH, 05);
	   		juniofestivo03.set(Calendar.DAY_OF_MONTH, 29); 
	   		int mesjunio=juniofestivo01.get(Calendar.MONTH);
	   		int diajunio01=juniofestivo01.get(Calendar.DAY_OF_MONTH); 
	   		int diajunio02=juniofestivo02.get(Calendar.DAY_OF_MONTH); 
	   		int diajunio03=juniofestivo03.get(Calendar.DAY_OF_MONTH); 
	   		int mesJunio=mesjunio+1;
	
	   		
	   		Calendar juliofestivo01 = new GregorianCalendar();
	   		juliofestivo01.set(Calendar.YEAR, 2020);
	   		juliofestivo01.set(Calendar.MONTH,06);
	   		juliofestivo01.set(Calendar.DAY_OF_MONTH, 20); 
	   		int mesjulio=juliofestivo01.get(Calendar.MONTH);
	   		int diajulio01=juliofestivo01.get(Calendar.DAY_OF_MONTH); 
	   		int mesJulio=mesjulio+1;
	   		
	   
	   		Calendar agostofestivo01 = new GregorianCalendar();
	   		agostofestivo01.set(Calendar.YEAR, 2020);
	   		agostofestivo01.set(Calendar.MONTH, 07);
	   		agostofestivo01.set(Calendar.DAY_OF_MONTH, 7); 
	   		
	   		
	   		Calendar agostofestivo02 = new GregorianCalendar();
	   		agostofestivo02.set(Calendar.YEAR, 2020);
	   		agostofestivo02.set(Calendar.MONTH, 07);
	   		agostofestivo02.set(Calendar.DAY_OF_MONTH, 17); 
	   		int mesagosto=agostofestivo01.get(Calendar.MONTH);
	   		int diaagosto01=agostofestivo01.get(Calendar.DAY_OF_MONTH); 
	   		int diaagosto02=agostofestivo02.get(Calendar.DAY_OF_MONTH); 
	   		int mesAgosto=mesagosto+1;
	   		
	 
	   		Calendar octubrefestivo01 = new GregorianCalendar();
	   		octubrefestivo01.set(Calendar.YEAR, 2020);
	   		octubrefestivo01.set(Calendar.MONTH, 9);
	   		octubrefestivo01.set(Calendar.DAY_OF_MONTH, 12); 
	   		int mesoctubre=octubrefestivo01.get(Calendar.MONTH);
	   		int diaoctubre01=octubrefestivo01.get(Calendar.DAY_OF_MONTH); 
	   		int mesOct=mesoctubre+1;
	   		
	 
	   	
	   		
	   		Calendar noviembrefestivo01 = new GregorianCalendar();
	   		noviembrefestivo01.set(Calendar.YEAR, 2020);
	   		noviembrefestivo01.set(Calendar.MONTH, 10);
	   		noviembrefestivo01.set(Calendar.DAY_OF_MONTH, 2); 
	   		
	   		
	   		Calendar noviembrefestivo02 = new GregorianCalendar();
	   		noviembrefestivo02.set(Calendar.YEAR, 2020);
	   		noviembrefestivo02.set(Calendar.MONTH, 10);
	   		noviembrefestivo02.set(Calendar.DAY_OF_MONTH, 16); 
	   		int mesnoviembre=noviembrefestivo01.get(Calendar.MONTH);
	   		int dianoviembre01=noviembrefestivo01.get(Calendar.DAY_OF_MONTH); 
	   		int dianoviembre02=noviembrefestivo02.get(Calendar.DAY_OF_MONTH); 
	   		int mesNoviembre=mesnoviembre+1;
	   		

	   		
	   		Calendar diciembrefestivo01 = new GregorianCalendar();
	   		diciembrefestivo01.set(Calendar.YEAR, 2020);
	   		diciembrefestivo01.set(Calendar.MONTH, 11);
	   		diciembrefestivo01.set(Calendar.DAY_OF_MONTH, 8); 
	   		
	   		
	   		Calendar diciembrefestivo02 = new GregorianCalendar();
	   		diciembrefestivo02.set(Calendar.YEAR, 2020);
	   		diciembrefestivo02.set(Calendar.MONTH, 11);
	   		diciembrefestivo02.set(Calendar.DAY_OF_MONTH, 25); 
	   		int mesdiciembre=diciembrefestivo01.get(Calendar.MONTH);
	   		int diadiciembre01=diciembrefestivo01.get(Calendar.DAY_OF_MONTH); 
	   		int diadiciembre02=diciembrefestivo02.get(Calendar.DAY_OF_MONTH); 
	   		int mesDiciembre=mesdiciembre+1;
	   		 
//----------------------------------------------------enero---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------//

	   		//---------------------------------- eneroo dias normales-------------//
	   	 if(mesfinalaprobacion==mesactual && mesactual==mesEne && diaaprobacion >diaenero02 && diaaprobacion !=diaprobacion) {
	   			int i;
	   			for( i=0; i<diasmes.size();i++) {
	   				diasmes.get(i);
	   				 if(diasmes.get(i)==diaaprobacion) {
	   					diaaprobacion=diasmes.get(i);
	   					diafenero02=diaaprobacion;
	   					System.out.println("eneroa");
	   				}
	   			
	   			}
	   		}	
	 	//---------------------------------- fin eneroo dias normales-------------//
	   	 
	 	//---------------------------------- eneroo dias cruzados con el festivo-------------//
	   	 if(mesfinalaprobacion==mesactual && mesactual==mesEne && diaaprobacion <diaenero02) {
	   			int i;
	   			for( i=0; i<diasmes.size();i++) {
	   				diasmes.get(i);
	   			 if(diasmes.get(i)==diaenero02) {
	   					diaenero02=diasmes.get(i);
	   					diafenero02=diaenero02;
	   					System.out.println("enerob");
	   				}
	   			}
	   		}	
	   //----------------------------------fin eneroo dias cruzados con el festivo-------------//
	   	 
	
	
		   //---------------------------------- 31 de enero-------------// 
		 if((mesfinalaprobacion==mesEne && mesactual==mesEne && diaprobacion >diaenero02 &&  diaaprobacion==diaprobacion )|| (mesfinalaprobacion==mesEne && mesactual==mesFeb && diaprobacion >diaenero02 &&   diaaprobacion==diaprobacion)) {
	   			int i;
	   			for( i=0; i<diasmes.size();i++) {
	   				diasmes.get(i);
	   				 if(diasmes.get(i)==diaaprobacion) {
	   					diaprobacion=diaaprobacion;
	   					System.out.println("eneroc");
	   				}
	   			}
	   		}
		 //----------------------------------fin  31 de enero-------------//
//---------------------------------fin enero----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------//
		 
		 
		 
		 
	   	
//--------------------------------------------------- febrero---------------------------------------------------------------------------------------------------------//
	   		
	   		 if(mesfinalaprobacion==mesFeb && mesactual==mesFeb ||mesfinalaprobacion==mesFeb && mesactual==mesMar ) {
	   			int i;
	   			for( i=0; i<febrerof.size();i++) {
	   				febrerof.get(i);
	   			 if(febrerof.get(i)==diaaprobacion) {
	   					diaaprobacion=febrerof.get(i);
	   					diafebrero=diaaprobacion;
	   					System.out.println("febreroa");
	   				}
	   			}
	   		}
	   		 
//----------------------------------------fin febrero---------------------------------------------------------------------------------------------//
	   		 
	   	
	   		 
//-----------------------------marzo---------------------------------------------------------------------------------------------------------------------//
	   
	   		 //-------------------------------------- dias normales antes del festivo-------------------------------------------------------------------//
	   	//-- diamarzon=13--//

	   	   	 if(mesfinalaprobacion==mesactual && mesactual==mesMar && diaaprobacion < diamarzon  && diaaprobacion <diamarzo01) {
		   			int i;
		   	  	
		   			for( i=0; i<diasmes.size();i++) {
		   				diasmes.get(i);
		   				
		   				 if(diasmes.get(i)==diamarzo01 && diaaprobacion < diamarzon ) {
		   					diamarzot=diaaprobacion;
		   					System.out.println("marzoa");
		   				}
		   			}
		   		}
	
	   	//--------------------------------------fin  dias normales antes del festivo-------------------------------------------------------------------//
	   	
	   	   	 
	   	//--------------------------------------dias que se cruzan con el festivo 23 de marzo---------------------//   	 
	   	   	 
	   	  if(mesfinalaprobacion==mesactual && mesactual==mesMar && diaaprobacion <diamarzo01) {
	   			int i;
	   			
	   			
	   			for( i=0; i<marzoN.size();i++) {
	   				marzoN.get(i);
	   				
	   			 if(marzoN.get(i)==diaaprobacion ) {
	   					diamarzo=diamarzo01;
	   					System.out.println("marzob");
	   				}
	   			}
	   		}
	  	//--------------------------------------fin dias que se cruzan con el festivo 23 de marzo---------------------//  
	   	  
	   	  
	   	  
	  //----------------------------------------dias normales despues del festivo 23 marzo-------------------------// 	  
	   	  
	  if(mesfinalaprobacion==mesactual && mesactual==mesMar && diaaprobacion >diamarzo01  && diaaprobacion  < diaprobacion  ) {
	   			int i;
	   			for( i=0; i<diasmes.size();i++) {
	   				diasmes.get(i);
	   				 if(diasmes.get(i)==diaaprobacion) {
	   					diaaprobacion=diasmes.get(i);
	   					diamarzod=diaaprobacion;
	   					System.out.println("marzoc");
	   				}
	   			}
	   		}
	  //----------------------------------------fin dias normales despues del festivo 23 marzo-------------------------// 

			
	  
	  //----------------------------------------------cuando el dia es 31 de marzo---------------------------------------------//
	   			 if((mesfinalaprobacion==mesMar && mesactual==mesMar && diaaprobacion >diaabril01 &&   diaaprobacion >diaabril02 && diaaprobacion==diaprobacion )|| (mesfinalaprobacion==mesMar && mesactual==mesAbril && diaaprobacion >diaabril01 &&   diaaprobacion >diaabril02 && diaaprobacion==diaprobacion)) {
	   			int i;
	   			for( i=0; i<marzoabril.size();i++) {
	   				marzoabril.get(i);
	   				 if(marzoabril.get(i)==diaaprobacion) {
	   					diaprobacion=diaaprobacion;
	   					System.out.println("marzod");
	   				}
	   			}
	   		} 
	    //----------------------------------------------fin cuando el dia es 31 de marzo---------------------------------------------//
	   			 
	   			 
	   	//--------------------------------------------fin marzo-------------------------------------------------------------------------//		 
	   			 
	   		
//----------------------------------------------------------abril-----------------------------------------------------------------------------//

	   	//--------------------------------------------dias que se cruzan con los festivos de abril----------------------------------//		 
	   	 if(mesfinalaprobacion==mesAbril && mesactual==mesAbril && diaaprobacion <diaabril01 &&   diaaprobacion <diaabril02 ) {
		   			int i;
		   			for( i=0; i<diasmes.size();i++) {
		   				diasmes.get(i);
		   				 if(diasmes.get(i)==diaabril02) {
		   					diaabril02=diasmes.get(i);
		   					diaabrilf=diaabril02;
		   					System.out.println("abrila");
		   				}
		   			}
		   		}
		   	//--------------------------------------------fin dias que se cruzan con los festivos de abril----------------------------------//		
	   	 
	   	 
	   	 //----------------------------------------------------------dias normales despues de los festivos de abril--------------------------//
	   		  if(mesfinalaprobacion==mesAbril && mesactual==mesAbril && diaaprobacion > diaabril01 &&   diaaprobacion > diaabril02 && diaaprobacion < minabrilmayo ) {
	   			int i;
	   			for( i=0; i<diasmes.size();i++) {
	   				diasmes.get(i);
	   			if(diasmes.get(i)==diaaprobacion) {
	   					diaaprobacion=diasmes.get(i);
	   					diaabrilf=diaaprobacion;
	   					System.out.println("abrilb");
	   				}
	   			}
	   		}	
	   	   	 //----------------------------------------------------------dias normales despues de los festivos de abril--------------------------//
	   		  
	   		  
	   		//------------------------------------Dias abril que se cruzan con el 1 de mayo-------------------------------------------------------------------//
	   		  if((mesfinalaprobacion==mesAbril && mesactual==mesAbril && diaaprobacion > diaabril01 &&   diaaprobacion > diaabril02 && diaaprobacion >= minabrilmayo)|| (mesfinalaprobacion==mesAbril && mesactual==mesMAyo && diaaprobacion > diaabril01 &&   diaaprobacion > diaabril02 && diaaprobacion >= minabrilmayo) ) {
	   			int jy;
	   			for( jy=0; jy<abrilmayo2.size();jy++) {
	   				abrilmayo2.get(jy);
	   			if(abrilmayo2.get(jy)==diaaprobacion) {
	   					diaaprobacion=abrilmayo2.get(jy);
	   					diaabrilmayo=diaaprobacion;
	   					
	   				}
	   			}
	   			  int i;
		   			for( i=0; i<abrilmayo.size();i++) {
		   				abrilmayo.get(i);
		   			if(abrilmayo.get(i).equals(fechaaprobacion)) {
		   				    abril22=abrilmayo.get(0);
		   			}
		   			if(abrilmayo.get(i).equals(fechaaprobacion)) {
	   				    abril23=abrilmayo.get(1);
	   					
	   				}
		   			if(abrilmayo.get(i).equals(fechaaprobacion)) {
	   				    abril24=abrilmayo.get(2);
	   					
	   				}
		   			if(abrilmayo.get(i).equals(fechaaprobacion)) {
	   				    abril25=abrilmayo.get(3);
	   					
	   				}
		   			if(abrilmayo.get(i).equals(fechaaprobacion)) {
	   				    abril26=abrilmayo.get(4);
	   					
	   				}
		   			if(abrilmayo.get(i).equals(fechaaprobacion)) {
	   				    abril27=abrilmayo.get(5);
	   					
	   				}
		   			if(abrilmayo.get(i).equals(fechaaprobacion)) {
	   				    abril28=abrilmayo.get(6);
	   					
	   				}
		   			if(abrilmayo.get(i).equals(fechaaprobacion)) {
	   				    abril29=abrilmayo.get(7);
	   					
	   				}
		   			if(abrilmayo.get(i).equals(fechaaprobacion)) {
	   				    abril30=abrilmayo.get(8);
	   					
	   				}
		   			}
		   			System.out.println("abrilc");
		   		}	
		   		//------------------------------------fin Dias abril que se cruzan con el 1 de mayo-------------------------------------------------------------------//

//------------------------------------------------mayo-------------------------------------------------------------------------------------------------------------------------------//
	   		 
	   		  //---------------------------------mayo dias normales antes del cruze de los dias con el fstivo 25---------------------------//
	   		  if(mesfinalaprobacion==mesMAyo && mesactual==mesMAyo && diaaprobacion > diamayo01 &&   diaaprobacion < minmayo) {
		   			int i;
		   			for( i=0; i<diasmes.size();i++) {
		   				diasmes.get(i);
		   			if(diasmes.get(i)==diaaprobacion) {
		   					diaaprobacion=diasmes.get(i);
		   					diamayo=diaaprobacion;
		   					System.out.println("mayoa");
		   				}
		   			}
		   		} 
	   		 //---------------------------------fin mayo dias normales antes del festivo 23---------------------------//
	   		  
	   		  //--------------------------------dias mayo que se cruzan con el festivo 23 de mayo--------------------//
	   		  if(mesfinalaprobacion==mesactual && mesactual==mesMAyo && diaaprobacion <diamayo02) {
		   			int i;
		   			
		   			
		   			for( i=0; i<mayo.size();i++) {
		   				mayo.get(i);
		   				
		   			 if(mayo.get(i)==diaaprobacion ) {
		   				    diamayofes=diamayo02;
		   					System.out.println("mayob");
		   				}
		   			}
		   		}
	   		 //--------------------------------fin dias mayo que se cruzan con el festivo 23 de mayo--------------------//
	   		  
	   		  //---------------------------dias normales despues del festivo 23 de mayo------------------------------//
	   		  if(mesfinalaprobacion==mesMAyo && mesactual==mesMAyo && diaaprobacion > diamayo02  && diaaprobacion < diaprobacion) {
		   			int i;
		   			for( i=0; i<diasmes.size();i++) {
		   				diasmes.get(i);
		   			if(diasmes.get(i)==diaaprobacion) {
		   					diaaprobacion=diasmes.get(i);
		   					diamayonor=diaaprobacion;
		   					System.out.println("mayoc");
		   				}
		   			
		   			}
		   		}
	  
	   		  
	   		  //---------------------------fin dias normales despues del festivo 23 de mayo------------------------------//
	   		  
	   		  //----------------------------31 de mayo-----------------------------------------------------------------//
	   		  if(mesfinalaprobacion==mesMAyo && mesactual==mesMAyo && diaaprobacion > diamayo02 && diaaprobacion == diaprobacion  ) {
		   			int i;
		   			for( i=0; i<diasmes.size();i++) {
		   				diasmes.get(i);
		   			if(diasmes.get(i)==diaaprobacion) {
		   					diaaprobacion=diasmes.get(i);
		   					diaprobacion=diaaprobacion;
		   					System.out.println("mayod");
		   				}
		   			
		   			}
		   		}
	   		  //---------------------------fin 31 de mayo-------------------------------------------------------------//
	   		  //--------------------------------fin mayo-----------------------------------------------------------------//
	   		  
	   		  
	   		  //--------------------------junio---------------------------------------------------------------------------------//
	   		 if(mesfinalaprobacion==mesJunio && mesactual==mesJunio &&   diaaprobacion < minjunio && diaaprobacion < diajunio01) {
		   			int i;
		   			for( i=0; i<diasmes.size();i++) {
		   				diasmes.get(i);
		   			if(diasmes.get(i)==diaaprobacion) {
		   					diaaprobacion=diasmes.get(i);
		   					diajunion=diaaprobacion;
		   					System.out.println("junioa");
		   				}
		   			}
		   		} 
	   		  //----------------------------dias normales junio antes de los dias que se cruzan con el festivo 15--------------------------------------------//
	   		  
	   		  
	   		 
	   	  if(mesfinalaprobacion==mesJunio && mesactual==mesJunio && diaaprobacion >=minjunio && diaaprobacion <= maxjunio) {
	   			int i;
	   			for( i=0; i<junio.size();i++) {
	   				junio.get(i);
	   			 if(junio.get(i)==diaaprobacion ) {
	   					diajuniof01=diajunio01;
	   					System.out.println("juniob");
	   				}
	   			}
	   		}
	   		 
	   		 
	   		 
	   		 
	   		 
	   		 
	   		  //------------------------fin dias normales junio antes del 15 de junio--------------------------------------------//

	   		  
	   		  //---------------------------------------fin dias mayo que se cruzan con el festivo  6 de junio----------------------------//
	   		  
	   		  
	   		//---------------------------------------------------fin junio-----------------------------------------------------//

	
	   		//-----------------------------------------valida el festivo de enero con los dias que se cruzan--------------//
	   		       if(diax.equals("lun")&& diaaprobacion+1==diafenero02 ) {
	   					    SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
		   					 nuevocalendario.add(Calendar.DATE, 9);
		   					  newdate=formateofecha.format(nuevocalendario.getTime());
		   					 System.out.println("el dia es:"+diax+""+"y la nueva fecha es:"+newdate);
	   					}
	   					if(diax.equals("lun")&& diaaprobacion+2==diafenero02 ) {
		   				     SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
		   					 nuevocalendario.add(Calendar.DATE, 10);
		   					  newdate=formateofecha.format(nuevocalendario.getTime());
		   					 System.out.println("el dia es:"+diax+""+"y la nueva fecha es:"+newdate);
		   					}
	   					if(diax.equals("lun")&& diaaprobacion+3==diafenero02 ) {
		   					SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
		   					 nuevocalendario.add(Calendar.DATE, 10);
		   					  newdate=formateofecha.format(nuevocalendario.getTime());
		   					 System.out.println("el dia es:"+diax+""+"y la nueva fecha es:"+newdate);
		   					
		   					}
	   					if(diax.equals("lun")&& diaaprobacion+4==diafenero02 ) {
		   					 SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
		   					 nuevocalendario.add(Calendar.DATE, 10);
		   					  newdate=formateofecha.format(nuevocalendario.getTime());
		   					 System.out.println("el dia es:"+diax+""+"y la nueva fecha es:"+newdate);
		   					
		   					}
	   					if(diax.equals("mar")&& diaaprobacion+1==diafenero02  ) {
		   					 SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
		   					 nuevocalendario.add(Calendar.DATE, 10);
		   					  newdate=formateofecha.format(nuevocalendario.getTime());
		   					 System.out.println("el dia es:"+diax+""+"y la nueva fecha es:"+newdate);
		   					
		   					}
	   					if(diax.equals("mar")&& diaaprobacion+2==diafenero02 ) {
		   					 SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
		   					 nuevocalendario.add(Calendar.DATE, 10);
		   					  newdate=formateofecha.format(nuevocalendario.getTime());
		   					 System.out.println("el dia es:"+diax+""+"y la nueva fecha es:"+newdate);
		   					
		   					}
	   					if(diax.equals("mar")&& diaaprobacion+3==diafenero02 ) {
		   					SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
		   					 nuevocalendario.add(Calendar.DATE, 10);
		   					  newdate=formateofecha.format(nuevocalendario.getTime());
		   					 System.out.println("el dia es:"+diax+""+"y la nueva fecha es:"+newdate);
		   					
		   					}
	   					if(diax.equals("mar")&& diaaprobacion+4==diafenero02 ) {
		   					SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
		   					 nuevocalendario.add(Calendar.DATE, 10);
		   					  newdate=formateofecha.format(nuevocalendario.getTime());
		   					 System.out.println("el dia es:"+diax+""+"y la nueva fecha es:"+newdate);
		   					
		   					}
	   					if(diax.equals("mié")&& diaaprobacion+1==diafenero02 ) {
		   				     SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
		   					 nuevocalendario.add(Calendar.DATE, 10);
		   					  newdate=formateofecha.format(nuevocalendario.getTime());
		   					 System.out.println("el dia es:"+diax+" "+"y la nueva fecha es:"+newdate);
		   					
		   					}
	   					if(diax.equals("mié")&& diaaprobacion+2==diafenero02 ) {
		   				    SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
		   					 nuevocalendario.add(Calendar.DATE, 10);
		   					  newdate=formateofecha.format(nuevocalendario.getTime());
		   					 System.out.println("el dia es:"+diax+""+"y la nueva fecha es:"+newdate);
		   					
		   					}
	   					if(diax.equals("mié")&& diaaprobacion+3==diafenero02) {
		   				     SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
		   					 nuevocalendario.add(Calendar.DATE, 10);
		   					  newdate=formateofecha.format(nuevocalendario.getTime());
		   					 System.out.println("el dia es:"+diax+""+"y la nueva fecha es:"+newdate);
		   					}
	   					if(diax.equals("mié")&& diaaprobacion+4==diafenero02 ) {
		   					 SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
		   					 nuevocalendario.add(Calendar.DATE, 9);
		   					  newdate=formateofecha.format(nuevocalendario.getTime());
		   					 System.out.println("el dia es:"+diax+""+"y la nueva fecha es:"+newdate);
		   					
		   					}
	   					if(diax.equals("jue")&& diaaprobacion+1==diafenero02 ) {
		   					 SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
		   					 nuevocalendario.add(Calendar.DATE, 10);
		   					  newdate=formateofecha.format(nuevocalendario.getTime());
		   					 System.out.println("el dia es:"+diax+""+"y la nueva fecha es:"+newdate);
		   					
		   					}
	   					if(diax.equals("jue")&& diaaprobacion+2==diafenero02 ) {
		   					 SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
		   					 nuevocalendario.add(Calendar.DATE, 11);
		   					  newdate=formateofecha.format(nuevocalendario.getTime());
		   					 System.out.println("el dia es:"+diax+""+"y la nueva fecha es:"+newdate);
		   					
		   					}
	   					else  if(diax.equals("jue")&& diaaprobacion+3==diafenero02 ) {
		   					 SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
		   					 nuevocalendario.add(Calendar.DATE, 9);
		   					newdate=formateofecha.format(nuevocalendario.getTime());
		   					 System.out.println("el dia es:"+diax+""+"y la nueva fecha es:"+newdate);
		   					
		   					}
	   					else  if(diax.equals("jue")&& diaaprobacion+4==diafenero02 ) {
		   					 SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
		   					 nuevocalendario.add(Calendar.DATE, 11);
		   					  newdate=formateofecha.format(nuevocalendario.getTime());
		   					 System.out.println("el dia es:"+diax+""+"y la nueva fecha es:"+newdate);
		   					
		   					}
	   					if(diax.equals("vie")&& diaaprobacion+1==diafenero02 ) {
		   			          SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
		   					 nuevocalendario.add(Calendar.DATE, 11);
		   					  newdate=formateofecha.format(nuevocalendario.getTime());
		   					 System.out.println("el dia es:"+diax+""+"y la nueva fecha es 1:"+newdate);
		   					}
	   					if(diax.equals("vie")&& diaaprobacion+2 ==diafenero02 ) {
		   					 SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
		   					 nuevocalendario.add(Calendar.DATE, 10);
		   					  newdate=formateofecha.format(nuevocalendario.getTime());
		   					 System.out.println("el dia es:"+diax+""+"y la nueva fecha es 2:"+newdate);
		   					
		   					}
	   					if(diax.equals("vie")&& diaaprobacion+3 ==diafenero02 ) {
		   					  SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
		   					 nuevocalendario.add(Calendar.DATE, 11);
		   					  newdate=formateofecha.format(nuevocalendario.getTime());
		   					 System.out.println("el dia es:"+diax+""+"y la nueva fecha es 3:"+newdate);
		   					
		   					}
	   					if(diax.equals("vie")&& diaaprobacion+4 ==diafenero02 ) {
		   				 SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
		   					 nuevocalendario.add(Calendar.DATE, 11);
		   					  newdate=formateofecha.format(nuevocalendario.getTime());
		   					 System.out.println("el dia es:"+diax+""+"y la nueva fecha es 4:"+newdate);
		   					
		   					}
	   					    if(diax.equals("sáb")&& diaaprobacion+1==diafenero02 ) {
		   			          SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
		   					 nuevocalendario.add(Calendar.DATE, 10);
		   					  newdate=formateofecha.format(nuevocalendario.getTime());
		   					 System.out.println("el dia es:"+diax+""+"y la nueva fecha es :"+newdate);
		   					}
	   					  if(diax.equals("sáb")&& diaaprobacion+2==diafenero02 ) {
		   			          SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
		   					 nuevocalendario.add(Calendar.DATE, 11);
		   					  newdate=formateofecha.format(nuevocalendario.getTime());
		   					 System.out.println("el dia es:"+diax+""+"y la nueva fecha es :"+newdate);
		   					}
	   					 if(diax.equals("sáb")&& diaaprobacion+3==diafenero02 ) {
		   			          SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
		   					 nuevocalendario.add(Calendar.DATE, 11);
		   					  newdate=formateofecha.format(nuevocalendario.getTime());
		   					 System.out.println("el dia es:"+diax+""+"y la nueva fecha es :"+newdate);
		   					}
	   					
	   					   if(diax.equals("sáb")&& diaaprobacion+4==diafenero02 ) {
		   			          SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
		   					 nuevocalendario.add(Calendar.DATE, 11);
		   					  newdate=formateofecha.format(nuevocalendario.getTime());
		   					 System.out.println("el dia es:"+diax+""+"y la nueva fecha es:"+newdate);
		   					}
	   					   
	   					 if(diax.equals("lun")&& diaaprobacion==diafenero02 ) {
	   					    SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
		   					 nuevocalendario.add(Calendar.DATE, 9);
		   					  newdate=formateofecha.format(nuevocalendario.getTime());
		   					 System.out.println("el dia es:"+diax+""+"y la nueva fecha es:"+newdate);
	   					   }
	   					 if(diax.equals("mar")&& diaaprobacion==diafenero02 ) {
		   					    SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
			   					 nuevocalendario.add(Calendar.DATE, 9);
			   					  newdate=formateofecha.format(nuevocalendario.getTime());
			   					 System.out.println("el dia es:"+diax+""+"y la nueva fecha es: "+newdate);
		   					   }
	   					 if(diax.equals("mié")&& diaaprobacion==diafenero02 ) {
		   					    SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
			   					 nuevocalendario.add(Calendar.DATE, 9);
			   					  newdate=formateofecha.format(nuevocalendario.getTime());
			   					 System.out.println("el dia es:"+diax+""+"y la nueva fecha es:"+newdate);
		   					   }  
	   					 if(diax.equals("jue")&& diaaprobacion==diafenero02 ) {
		   					    SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
			   					 nuevocalendario.add(Calendar.DATE, 9);
			   					  newdate=formateofecha.format(nuevocalendario.getTime());
			   					 System.out.println("el dia es:"+diax+""+"y la nueva fecha es:"+newdate);
		   					   }  
	   					if(diax.equals("vie")&& diaaprobacion==diafenero02 ) {
	   					    SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
		   					 nuevocalendario.add(Calendar.DATE, 10);
		   					  newdate=formateofecha.format(nuevocalendario.getTime());
		   					 System.out.println("el dia es:"+diax+""+"y la nueva fecha es 1a:"+newdate);
	   					   }
	   					if(diax.equals("sáb")&& diaaprobacion==diafenero02 ) {
	   					    SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
		   					 nuevocalendario.add(Calendar.DATE, 10);
		   					  newdate=formateofecha.format(nuevocalendario.getTime());
		   					 System.out.println("el dia es:"+diax+""+"y la nueva fecha es:"+newdate);
	   					   }  
	   				//-----------------------------------------fin valida el festivo de enero con los dias que se cruzan--------------//
	   					
	   					//--------------------valida 31 de enero en enero y febrero---------------//
	   					if((diax.equals("lun") && diaaprobacion==diaprobacion && mesfinalaprobacion==mesEne && mesactual==mesEne) || (diax.equals("lun") && diaaprobacion==diaprobacion && mesfinalaprobacion==mesEne && mesactual==mesFeb) ) {
	   					    SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
	   						 nuevocalendario.add(Calendar.DATE, 11);
	   						  newdate=formateofecha.format(nuevocalendario.getTime());
	   						 System.out.println("el dia es:"+diax+""+"y la nueva fecha es:"+newdate);
	   					}
	   					if((diax.equals("mar") && diaaprobacion==diaprobacion && mesfinalaprobacion==mesEne && mesactual==mesEne) || (diax.equals("mar") && diaaprobacion==diaprobacion && mesfinalaprobacion==mesEne && mesactual==mesFeb) )  {
	   					    SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
	   						 nuevocalendario.add(Calendar.DATE, 11);
	   						  newdate=formateofecha.format(nuevocalendario.getTime());
	   						 System.out.println("el dia es:"+diax+""+"y la nueva fecha es:"+newdate);
	   					}
	   					if((diax.equals("mié") && diaaprobacion==diaprobacion && mesfinalaprobacion==mesEne && mesactual==mesEne) || (diax.equals("mié") && diaaprobacion==diaprobacion && mesfinalaprobacion==mesEne && mesactual==mesFeb) )  {
	   					    SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
	   						 nuevocalendario.add(Calendar.DATE, 11);
	   						  newdate=formateofecha.format(nuevocalendario.getTime());
	   						 System.out.println("el dia es:"+diax+""+"y la nueva fecha es:"+newdate);
	   					}
	   					if((diax.equals("jue") && diaaprobacion==diaprobacion && mesfinalaprobacion==mesEne && mesactual==mesEne) || (diax.equals("jue") && diaaprobacion==diaprobacion && mesfinalaprobacion==mesEne && mesactual==mesFeb) )  {
	   					    SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
	   						 nuevocalendario.add(Calendar.DATE, 11);
	   						  newdate=formateofecha.format(nuevocalendario.getTime());
	   						 System.out.println("el dia es:"+diax+""+"y la nueva fecha es:"+newdate);
	   					}
	   					if((diax.equals("vie") && diaaprobacion==diaprobacion && mesfinalaprobacion==mesEne && mesactual==mesEne) || (diax.equals("vie") && diaaprobacion==diaprobacion && mesfinalaprobacion==mesEne && mesactual==mesFeb) ) {
	   					    SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
	   						 nuevocalendario.add(Calendar.DATE, 10);
	   						  newdate=formateofecha.format(nuevocalendario.getTime());
	   						 System.out.println("el dia es:"+diax+""+"y la nueva fecha es "+newdate);
	   					}
	   					if((diax.equals("sáb") && diaaprobacion==diaprobacion && mesfinalaprobacion==mesEne && mesactual==mesEne) || (diax.equals("sáb") && diaaprobacion==diaprobacion && mesfinalaprobacion==mesEne && mesactual==mesFeb) )  {
	   					    SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
	   						 nuevocalendario.add(Calendar.DATE, 11);
	   						  newdate=formateofecha.format(nuevocalendario.getTime());
	   						 System.out.println("el dia es:"+diax+""+"y la nueva fecha es:"+newdate);
	   					}
	   				//--------------------fin validacion 31 de enero en enero y febrero---------------//
	   					
	   					
	   					
	   					
	   				//---------------------------valida dias febrero---------------------------------//	
	   					 if((diax.equals("lun")&& diaaprobacion==diafebrero && diafebrero < diaprobacion && mesfinalaprobacion==mesFeb && mesactual==mesFeb) || (diax.equals("lun")&& diaaprobacion==diafebrero && diafebrero < diaprobacion  && mesfinalaprobacion==mesFeb && mesactual==mesMar)) {
	   					    SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
		   					 nuevocalendario.add(Calendar.DATE, 9);
		   					  newdate=formateofecha.format(nuevocalendario.getTime());
		   					 System.out.println("el dia es:"+diax+""+"y la nueva fecha es:"+newdate);
	   					   }
	   					 if((diax.equals("mar")&& diaaprobacion==diafebrero && diafebrero < diaprobacion && mesfinalaprobacion==mesFeb && mesactual==mesFeb) || (diax.equals("mar")&& diaaprobacion==diafebrero && diafebrero < diaprobacion  && mesfinalaprobacion==mesFeb && mesactual==mesMar)) {
		   					    SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
			   					 nuevocalendario.add(Calendar.DATE, 9);
			   					  newdate=formateofecha.format(nuevocalendario.getTime());
			   					 System.out.println("el dia es:"+diax+""+"y la nueva fecha es pññp:"+newdate);
		   					   }
	   					 if((diax.equals("mié")&& diaaprobacion==diafebrero && diafebrero < diaprobacion && mesfinalaprobacion==mesFeb && mesactual==mesFeb) || (diax.equals("mié")&& diaaprobacion==diafebrero && diafebrero < diaprobacion  && mesfinalaprobacion==mesFeb && mesactual==mesMar)) {
		   					    SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
			   					 nuevocalendario.add(Calendar.DATE, 9);
			   					  newdate=formateofecha.format(nuevocalendario.getTime());
			   					 System.out.println("el dia es:"+diax+""+"y la nueva fecha es:"+newdate);
		   					   }  
	   					 if((diax.equals("jue")&& diaaprobacion==diafebrero && diafebrero < diaprobacion && mesfinalaprobacion==mesFeb && mesactual==mesFeb) || (diax.equals("jue")&& diaaprobacion==diafebrero && diafebrero < diaprobacion  && mesfinalaprobacion==mesFeb && mesactual==mesMar)) {
		   					    SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
			   					 nuevocalendario.add(Calendar.DATE, 9);
			   					  newdate=formateofecha.format(nuevocalendario.getTime());
			   					 System.out.println("el dia es:"+diax+""+"y la nueva fecha es:"+newdate);
		   					   }  
	   					 if((diax.equals("vie")&& diaaprobacion==diafebrero && diafebrero < diaprobacion && mesfinalaprobacion==mesFeb && mesactual==mesFeb) || (diax.equals("vie")&& diaaprobacion==diafebrero && diafebrero < diaprobacion  && mesfinalaprobacion==mesFeb && mesactual==mesMar)) {
	   					    SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
		   					 nuevocalendario.add(Calendar.DATE, 10);
		   					  newdate=formateofecha.format(nuevocalendario.getTime());
		   					 System.out.println("el dia es:"+diax+""+"y la nueva fecha es **:"+newdate);
	   					   }
	   					 if((diax.equals("sáb")&& diaaprobacion==diafebrero && diafebrero < diaprobacion && mesfinalaprobacion==mesFeb && mesactual==mesFeb) || (diax.equals("sáb")&& diaaprobacion==diafebrero && diafebrero < diaprobacion  && mesfinalaprobacion==mesFeb && mesactual==mesMar)) {
	   					    SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
		   					 nuevocalendario.add(Calendar.DATE, 10);
		   					  newdate=formateofecha.format(nuevocalendario.getTime());
		   					 System.out.println("el dia es:"+diax+""+"y la nueva fecha es:"+newdate);
	   					   } 
	   				//---------------------------fin validacion febrero---------------------------------//	
	   					
	   					
	   					//------------------------------------marzo-----------------------------------------//
	   				//-----------------------------------31 de marzo-----------------------------------------//
	   					if((diax.equals("lun") && diaaprobacion==diaprobacion && mesfinalaprobacion==mesMar && mesactual==mesMar) || (diax.equals("lun") && diaaprobacion==diaprobacion && mesfinalaprobacion==mesMar && mesactual==mesAbril) ) {
	   					    SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
	   						 nuevocalendario.add(Calendar.DATE, 11);
	   						  newdate=formateofecha.format(nuevocalendario.getTime());
	   						 System.out.println("el dia es:"+diax+""+"y la nueva fecha es:"+newdate);
	   					}
	   					if((diax.equals("mar") && diaaprobacion==diaprobacion && mesfinalaprobacion==mesMar && mesactual==mesMar) || (diax.equals("mar") && diaaprobacion==diaprobacion && mesfinalaprobacion==mesMar && mesactual==mesAbril) ) {
	   					    SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
	   						 nuevocalendario.add(Calendar.DATE, 11);
	   						  newdate=formateofecha.format(nuevocalendario.getTime());
	   						 System.out.println("el dia es:"+diax+""+"y la nueva fecha es:"+newdate);
	   					}
	   					if((diax.equals("mié") && diaaprobacion==diaprobacion && mesfinalaprobacion==mesMar && mesactual==mesMar) || (diax.equals("mié") && diaaprobacion==diaprobacion && mesfinalaprobacion==mesMar && mesactual==mesAbril) ) {
	   					    SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
	   						 nuevocalendario.add(Calendar.DATE, 11);
	   						  newdate=formateofecha.format(nuevocalendario.getTime());
	   						 System.out.println("el dia es:"+diax+""+"y la nueva fecha es:"+newdate);
	   					}
	   					if((diax.equals("jue") && diaaprobacion==diaprobacion && mesfinalaprobacion==mesMar && mesactual==mesMar) || (diax.equals("jue") && diaaprobacion==diaprobacion && mesfinalaprobacion==mesMar && mesactual==mesAbril) ) {
	   					    SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
	   						 nuevocalendario.add(Calendar.DATE, 11);
	   						  newdate=formateofecha.format(nuevocalendario.getTime());
	   						 System.out.println("el dia es:"+diax+""+"y la nueva fecha es:"+newdate);
	   					}
	   					if((diax.equals("vie") && diaaprobacion==diaprobacion && mesfinalaprobacion==mesMar && mesactual==mesMar) || (diax.equals("vie") && diaaprobacion==diaprobacion && mesfinalaprobacion==mesMar && mesactual==mesAbril) ) {
	   					    SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
	   						 nuevocalendario.add(Calendar.DATE, 11);
	   						  newdate=formateofecha.format(nuevocalendario.getTime());
	   						 System.out.println("el dia es:"+diax+""+"y la nueva fecha es yyyyy:"+newdate);
	   					}
	   					if((diax.equals("sáb") && diaaprobacion==diaprobacion && mesfinalaprobacion==mesMar && mesactual==mesMar) || (diax.equals("sáb") && diaaprobacion==diaprobacion && mesfinalaprobacion==mesMar && mesactual==mesAbril) ) {
	   					    SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
	   						 nuevocalendario.add(Calendar.DATE, 11);
	   						  newdate=formateofecha.format(nuevocalendario.getTime());
	   						 System.out.println("el dia es:"+diax+""+"y la nueva fecha es:"+newdate);
	   					}
	   					
	   				//-----------------------------------fin 31 de marzo-----------------------------------------//	
	   					
	   					//-----------------------------------dias que se cruzan con el 23 de marzo-----------------------------------------//		
	   					if(diax.equals("lun") && diaaprobacion+10==diamarzo ) {
	   					    SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
	   						 nuevocalendario.add(Calendar.DATE, 9);
	   						  newdate=formateofecha.format(nuevocalendario.getTime());
	   						 System.out.println("el dia es:"+diax+""+"y la nueva fecha es:"+newdate);
	   					}
	   					if(diax.equals("mar") && diaaprobacion+10==diamarzo ) {
	   					    SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
	   						 nuevocalendario.add(Calendar.DATE, 9);
	   						  newdate=formateofecha.format(nuevocalendario.getTime());
	   						 System.out.println("el dia es:"+diax+""+"y la nueva fecha es pppppppppp:"+newdate);
	   					}
	   					
	   					if(diax.equals("mié") && diaaprobacion+10==diamarzo ) {
	   					    SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
	   						 nuevocalendario.add(Calendar.DATE, 9);
	   						  newdate=formateofecha.format(nuevocalendario.getTime());
	   						 System.out.println("el dia es:"+diax+""+"y la nueva fecha es:"+newdate);
	   					}
	   					if(diax.equals("jue") && diaaprobacion+10==diamarzo ) {
	   					    SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
	   						 nuevocalendario.add(Calendar.DATE, 9);
	   						  newdate=formateofecha.format(nuevocalendario.getTime());
	   						 System.out.println("el dia es:"+diax+""+"y la nueva fecha es:"+newdate);
	   					}
	   					if(diax.equals("vie") && diaaprobacion+10==diamarzo ) {
	   					    SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
	   						 nuevocalendario.add(Calendar.DATE, 11);
	   						  newdate=formateofecha.format(nuevocalendario.getTime());
	   						 System.out.println("el dia es:"+diax+""+"y la nueva fecha es a **a:"+newdate);
	   					}
	   					if(diax.equals("sáb") && diaaprobacion+10==diamarzo ) {
	   					    SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
	   						 nuevocalendario.add(Calendar.DATE, 11);
	   						  newdate=formateofecha.format(nuevocalendario.getTime());
	   						 System.out.println("el dia es:"+diax+""+"y la nueva fecha es b:"+newdate);
	   					}

	   					if(diax.equals("lun")&& diaaprobacion+9==diamarzo ) {
	   					    SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
	   						 nuevocalendario.add(Calendar.DATE, 10);
	   						  newdate=formateofecha.format(nuevocalendario.getTime());
	   						 System.out.println("el dia es:"+diax+""+"y la nueva fecha es:"+newdate);
	   					}
	   					if(diax.equals("mar") && diaaprobacion+9==diamarzo ) {
	   					    SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
	   						 nuevocalendario.add(Calendar.DATE, 10);
	   						  newdate=formateofecha.format(nuevocalendario.getTime());
	   						 System.out.println("el dia es:"+diax+""+"y la nueva fecha es ooooo:"+newdate);
	   					}
	   					if(diax.equals("mié")&& diaaprobacion+9==diamarzo ) {
	   					    SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
	   						 nuevocalendario.add(Calendar.DATE, 10);
	   						  newdate=formateofecha.format(nuevocalendario.getTime());
	   						 System.out.println("el dia es:"+diax+""+"y la nueva fecha es:"+newdate);
	   					}
	   					if(diax.equals("jue") && diaaprobacion+9==diamarzo ) {
	   					    SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
	   						 nuevocalendario.add(Calendar.DATE, 11);
	   						  newdate=formateofecha.format(nuevocalendario.getTime());
	   						 System.out.println("el dia es:"+diax+""+"y la nueva fecha es:"+newdate);
	   					}
	   					if(diax.equals("vie") && diaaprobacion+9==diamarzo ) {
	   					    SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
	   						 nuevocalendario.add(Calendar.DATE, 10);
	   						  newdate=formateofecha.format(nuevocalendario.getTime());
	   						 System.out.println("el dia es:"+diax+""+"y la nueva fecha es **b:"+newdate);
	   					}
	   					if(diax.equals("sáb") && diaaprobacion+9==diamarzo ) {
	   					    SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
	   						 nuevocalendario.add(Calendar.DATE, 11);
	   						  newdate=formateofecha.format(nuevocalendario.getTime());
	   						 System.out.println("el dia es:"+diax+""+"y la nueva fecha es:"+newdate);
	   					}

	   					if(diax.equals("lun")&& diaaprobacion+8==diamarzo ) {
	   					    SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
	   						 nuevocalendario.add(Calendar.DATE, 10);
	   						  newdate=formateofecha.format(nuevocalendario.getTime());
	   						 System.out.println("el dia es:"+diax+""+"y la nueva fecha es:"+newdate);
	   					}
	   					if(diax.equals("mar")&& diaaprobacion+8==diamarzo ) {
	   					    SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
	   						 nuevocalendario.add(Calendar.DATE, 10);
	   						  newdate=formateofecha.format(nuevocalendario.getTime());
	   						 System.out.println("el dia es:"+diax+""+"y la nueva fecha es  hhhhhhh:"+newdate);
	   					}
	   					if(diax.equals("mié")&&  diaaprobacion+8==diamarzo ) {
	   					    SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
	   						 nuevocalendario.add(Calendar.DATE, 10);
	   						  newdate=formateofecha.format(nuevocalendario.getTime());
	   						 System.out.println("el dia es:"+diax+""+"y la nueva fecha es:"+newdate);
	   					}
	   					if(diax.equals("jue")&&  diaaprobacion+8==diamarzo ) {
	   					    SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
	   						 nuevocalendario.add(Calendar.DATE, 11);
	   						  newdate=formateofecha.format(nuevocalendario.getTime());
	   						 System.out.println("el dia es:"+diax+""+"y la nueva fecha es:"+newdate);
	   					}
	   					if(diax.equals("vie")&& diaaprobacion+8==diamarzo ) {
	   					    SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
	   						 nuevocalendario.add(Calendar.DATE, 11);
	   						  newdate=formateofecha.format(nuevocalendario.getTime());
	   						 System.out.println("el dia es:"+diax+""+"y la nueva fecha es **c:"+newdate);
	   					}
	   					if(diax.equals("sáb")&& diaaprobacion+8==diamarzo ) {
	   					    SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
	   						 nuevocalendario.add(Calendar.DATE, 10);
	   						  newdate=formateofecha.format(nuevocalendario.getTime());
	   						 System.out.println("el dia es:"+diax+""+"y la nueva fecha es:"+newdate);
	   					}

	   					if(diax.equals("lun")&& diaaprobacion+7==diamarzo ) {
	   					    SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
	   						 nuevocalendario.add(Calendar.DATE, 10);
	   						  newdate=formateofecha.format(nuevocalendario.getTime());
	   						 System.out.println("el dia es:"+diax+""+"y la nueva fecha es:"+newdate);
	   					}
	   					
	   					if(diax.equals("mar")&&  diaaprobacion+7==diamarzo ) {
	   					    SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
	   						 nuevocalendario.add(Calendar.DATE, 10);
	   						  newdate=formateofecha.format(nuevocalendario.getTime());
	   						 System.out.println("el dia es:"+diax+""+"y la nueva fecha es  yyyyyy:"+newdate);
	   					}			
	   					
	   					if(diax.equals("mié")&& diaaprobacion+7==diamarzo ) {
	   					    SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
	   						 nuevocalendario.add(Calendar.DATE, 10);
	   						  newdate=formateofecha.format(nuevocalendario.getTime());
	   						 System.out.println("el dia es:"+diax+""+"y la nueva fecha es:"+newdate);
	   					}
	   					if(diax.equals("jue")&& diaaprobacion+7==diamarzo ) {
	   					    SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
	   						 nuevocalendario.add(Calendar.DATE, 11);
	   						  newdate=formateofecha.format(nuevocalendario.getTime());
	   						 System.out.println("el dia es:"+diax+""+"y la nueva fecha es:"+newdate);
	   					}
	   					if(diax.equals("vie")&&  diaaprobacion+7==diamarzo ) {
	   					    SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
	   						 nuevocalendario.add(Calendar.DATE, 11);
	   						  newdate=formateofecha.format(nuevocalendario.getTime());
	   						 System.out.println("el dia es:"+diax+""+"y la nueva fecha es **d:"+newdate);
	   					}
	   					
	   					if(diax.equals("sáb") && diaaprobacion+7==diamarzo ) {
	   					    SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
	   						 nuevocalendario.add(Calendar.DATE, 11);
	   						  newdate=formateofecha.format(nuevocalendario.getTime());
	   						 System.out.println("el dia es:"+diax+""+"y la nueva fecha es:"+newdate);
	   					}
	   					
	   					if(diax.equals("lun")&&  diaaprobacion+6==diamarzo ) {
	   					    SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
	   						 nuevocalendario.add(Calendar.DATE, 9);
	   						  newdate=formateofecha.format(nuevocalendario.getTime());
	   						 System.out.println("el dia es:"+diax+""+"y la nueva fecha es:"+newdate);
	   					}
	   					
	   					if(diax.equals("mar")&&  diaaprobacion+6==diamarzo ) {
	   					    SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
	   						 nuevocalendario.add(Calendar.DATE, 10);
	   						  newdate=formateofecha.format(nuevocalendario.getTime());
	   						 System.out.println("el dia es:"+diax+""+"y la nueva fecha es: ghghgh"+newdate);
	   					}
	   					if(diax.equals("mié")&&  diaaprobacion+6==diamarzo ) {
	   					    SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
	   						 nuevocalendario.add(Calendar.DATE, 10);
	   						  newdate=formateofecha.format(nuevocalendario.getTime());
	   						 System.out.println("el dia es:"+diax+""+"y la nueva fecha es:"+newdate);
	   					}
	   					if(diax.equals("jue")&&  diaaprobacion+6==diamarzo ) {
	   					    SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
	   						 nuevocalendario.add(Calendar.DATE, 11);
	   						  newdate=formateofecha.format(nuevocalendario.getTime());
	   						 System.out.println("el dia es:"+diax+""+"y la nueva fecha es:"+newdate);
	   					}
	   					if(diax.equals("vie")&& diaaprobacion+6==diamarzo ) {
	   					    SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
	   						 nuevocalendario.add(Calendar.DATE, 11);
	   						  newdate=formateofecha.format(nuevocalendario.getTime());
	   						 System.out.println("el dia es:"+diax+""+"y la nueva fecha es **e:"+newdate);
	   					}
	   					if(diax.equals("sáb")&&  diaaprobacion+6==diamarzo ) {
	   					    SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
	   						 nuevocalendario.add(Calendar.DATE, 11);
	   						  newdate=formateofecha.format(nuevocalendario.getTime());
	   						 System.out.println("el dia es:"+diax+""+"y la nueva fecha es:"+newdate);
	   					}
	   					
	   					
	   					if(diax.equals("lun")&& diaaprobacion+5==diamarzo ) {
	   					    SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
	   						 nuevocalendario.add(Calendar.DATE, 10);
	   						  newdate=formateofecha.format(nuevocalendario.getTime());
	   						 System.out.println("el dia es:"+diax+""+"y la nueva fecha es:"+newdate);
	   					}
	   					
	   					if(diax.equals("mar")&&  diaaprobacion+5==diamarzo ) {
	   					    SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
	   						 nuevocalendario.add(Calendar.DATE, 9);
	   						  newdate=formateofecha.format(nuevocalendario.getTime());
	   						 System.out.println("el dia es:"+diax+""+"y la nueva fecha es  bnmb:"+newdate);
	   					}
	   					if(diax.equals("mié")&&  diaaprobacion+5==diamarzo ) {
	   					    SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
	   						 nuevocalendario.add(Calendar.DATE, 10);
	   						  newdate=formateofecha.format(nuevocalendario.getTime());
	   						 System.out.println("el dia es:"+diax+""+"y la nueva fecha es:"+newdate);
	   					}
	   					
	   					if(diax.equals("jue")&&  diaaprobacion+5==diamarzo ) {
	   					    SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
	   						 nuevocalendario.add(Calendar.DATE,11);
	   						  newdate=formateofecha.format(nuevocalendario.getTime());
	   						 System.out.println("el dia es:"+diax+""+"y la nueva fecha es:"+newdate);
	   					}
	   					
	   					if(diax.equals("vie")&&  diaaprobacion+5==diamarzo ) {
	   					    SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
	   						 nuevocalendario.add(Calendar.DATE,11);
	   						  newdate=formateofecha.format(nuevocalendario.getTime());
	   						 System.out.println("el dia es:"+diax+""+"y la nueva fecha es **f:"+newdate);
	   					}
	   					if(diax.equals("sáb")&&  diaaprobacion+5==diamarzo ) {
	   					    SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
	   						 nuevocalendario.add(Calendar.DATE,11);
	   						  newdate=formateofecha.format(nuevocalendario.getTime());
	   						 System.out.println("el dia es:"+diax+""+"y la nueva fecha es:"+newdate);
	   					}
	   					
	   					if(diax.equals("lun")&&  diaaprobacion+4==diamarzo ) {
	   					    SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
	   						 nuevocalendario.add(Calendar.DATE, 10);
	   						  newdate=formateofecha.format(nuevocalendario.getTime());
	   						 System.out.println("el dia es:"+diax+""+"y la nueva fecha es:"+newdate);
	   					}

	   					if(diax.equals("mar")&&  diaaprobacion+4==diamarzo ) {
	   					    SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
	   						 nuevocalendario.add(Calendar.DATE, 10);
	   						  newdate=formateofecha.format(nuevocalendario.getTime());
	   						 System.out.println("el dia es:"+diax+""+"y la nueva fecha es ghjk:"+newdate);
	   					}
	   					
	   					if(diax.equals("mié")&& diaaprobacion+4==diamarzo ) {
	   					    SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
	   						 nuevocalendario.add(Calendar.DATE, 9);
	   						  newdate=formateofecha.format(nuevocalendario.getTime());
	   						 System.out.println("el dia es:"+diax+""+"y la nueva fecha es:"+newdate);
	   					}
	   					if(diax.equals("jue")&&  diaaprobacion+4==diamarzo ) {
	   					    SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
	   						 nuevocalendario.add(Calendar.DATE, 11);
	   						  newdate=formateofecha.format(nuevocalendario.getTime());
	   						 System.out.println("el dia es:"+diax+""+"y la nueva fecha es:"+newdate);
	   					}
	   					if(diax.equals("vie")&&  diaaprobacion+4==diamarzo ) {
	   					    SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
	   						 nuevocalendario.add(Calendar.DATE, 11);
	   						  newdate=formateofecha.format(nuevocalendario.getTime());
	   						 System.out.println("el dia es:"+diax+""+"y la nueva fecha es **g:"+newdate);
	   					}
	   					
	   					if(diax.equals("sáb")&& diaaprobacion+4==diamarzo ) {
	   					    SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
	   						 nuevocalendario.add(Calendar.DATE, 11);
	   						  newdate=formateofecha.format(nuevocalendario.getTime());
	   						 System.out.println("el dia es:"+diax+""+"y la nueva fecha es:"+newdate);
	   					}
	   					
	   					if(diax.equals("lun")&& diaaprobacion+3==diamarzo ) {
	   					    SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
	   						 nuevocalendario.add(Calendar.DATE, 10);
	   						  newdate=formateofecha.format(nuevocalendario.getTime());
	   						 System.out.println("el dia es:"+diax+""+"y la nueva fecha es:"+newdate);
	   					}
	   					if(diax.equals("mar")&&  diaaprobacion+3==diamarzo ) {
	   					    SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
	   						 nuevocalendario.add(Calendar.DATE, 10);
	   						  newdate=formateofecha.format(nuevocalendario.getTime());
	   						 System.out.println("el dia es:"+diax+""+"y la nueva fecha es jhjh:"+newdate);
	   					}
	   					
	   					if(diax.equals("mié")&&  diaaprobacion+3==diamarzo ) {
	   					    SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
	   						 nuevocalendario.add(Calendar.DATE, 10);
	   						  newdate=formateofecha.format(nuevocalendario.getTime());
	   						 System.out.println("el dia es:"+diax+""+"y la nueva fecha es:"+newdate);
	   					}
	   					
	   					if(diax.equals("jue")&& diaaprobacion+3==diamarzo ) {
	   					    SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
	   						 nuevocalendario.add(Calendar.DATE, 9);
	   						  newdate=formateofecha.format(nuevocalendario.getTime());
	   						 System.out.println("el dia es:"+diax+""+"y la nueva fecha es:"+newdate);
	   					}
	   					if(diax.equals("vie")&&  diaaprobacion+3==diamarzo ) {
	   					    SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
	   						 nuevocalendario.add(Calendar.DATE, 11);
	   						  newdate=formateofecha.format(nuevocalendario.getTime());
	   						 System.out.println("el dia es:"+diax+""+"y la nueva fecha es **h:"+newdate);
	   					}
	   					if(diax.equals("sáb")&&  diaaprobacion+3==diamarzo ) {
	   					    SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
	   						 nuevocalendario.add(Calendar.DATE, 11);
	   						  newdate=formateofecha.format(nuevocalendario.getTime());
	   						 System.out.println("el dia es:"+diax+""+"y la nueva fecha es:"+newdate);
	   					}

	   					if(diax.equals("lun")&&  diaaprobacion+2==diamarzo ) {
	   					    SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
	   						 nuevocalendario.add(Calendar.DATE, 10);
	   						  newdate=formateofecha.format(nuevocalendario.getTime());
	   						 System.out.println("el dia es:"+diax+""+"y la nueva fecha es:"+newdate);
	   					}
	   					if(diax.equals("mar")&& diaaprobacion+2==diamarzo ) {
	   					    SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
	   						 nuevocalendario.add(Calendar.DATE, 10);
	   						  newdate=formateofecha.format(nuevocalendario.getTime());
	   						 System.out.println("el dia es:"+diax+""+"y la nueva fecha es tyty:"+newdate);
	   					}
	   					if(diax.equals("mié")&&  diaaprobacion+2==diamarzo ) {
	   					    SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
	   						 nuevocalendario.add(Calendar.DATE, 10);
	   						  newdate=formateofecha.format(nuevocalendario.getTime());
	   						 System.out.println("el dia es:"+diax+""+"y la nueva fecha es:"+newdate);
	   					}
	   					if(diax.equals("jue")&& diaaprobacion+2==diamarzo ) {
	   					    SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
	   						 nuevocalendario.add(Calendar.DATE, 11);
	   						  newdate=formateofecha.format(nuevocalendario.getTime());
	   						 System.out.println("el dia es:"+diax+""+"y la nueva fecha es:"+newdate);
	   					}
	   					if(diax.equals("vie")&&  diaaprobacion+2==diamarzo ) {
	   					    SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
	   						 nuevocalendario.add(Calendar.DATE, 10);
	   						  newdate=formateofecha.format(nuevocalendario.getTime());
	   						 System.out.println("el dia es:"+diax+""+"y la nueva fecha es **i:"+newdate);
	   					}
	   					if(diax.equals("sáb")&& diaaprobacion+2==diamarzo ) {
	   					    SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
	   						 nuevocalendario.add(Calendar.DATE, 11);
	   						  newdate=formateofecha.format(nuevocalendario.getTime());
	   						 System.out.println("el dia es:"+diax+""+"y la nueva fecha es:"+newdate);
	   					}

	   					if(diax.equals("lun")&& diaaprobacion+1==diamarzo ) {
	   					    SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
	   						 nuevocalendario.add(Calendar.DATE, 10);
	   						  newdate=formateofecha.format(nuevocalendario.getTime());
	   						 System.out.println("el dia es:"+diax+""+"y la nueva fecha es:"+newdate);
	   					}
	   					if(diax.equals("mar")&&  diaaprobacion+1==diamarzo ) {
	   					    SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
	   						 nuevocalendario.add(Calendar.DATE, 10);
	   						  newdate=formateofecha.format(nuevocalendario.getTime());
	   						 System.out.println("el dia es:"+diax+""+"y la nueva fecha es xxx:"+newdate);
	   					}
	   					if(diax.equals("mié")&&  diaaprobacion+1==diamarzo ) {
	   					    SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
	   						 nuevocalendario.add(Calendar.DATE, 10);
	   						  newdate=formateofecha.format(nuevocalendario.getTime());
	   						 System.out.println("el dia es:"+diax+""+"y la nueva fecha es:"+newdate);
	   					}
	   					if(diax.equals("jue")&&  diaaprobacion+1==diamarzo ) {
	   					    SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
	   						 nuevocalendario.add(Calendar.DATE, 11);
	   						  newdate=formateofecha.format(nuevocalendario.getTime());
	   						 System.out.println("el dia es:"+diax+""+"y la nueva fecha es:"+newdate);
	   					}
	   					if(diax.equals("vie")&&  diaaprobacion+1==diamarzo ) {
	   					    SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
	   						 nuevocalendario.add(Calendar.DATE, 11);
	   						  newdate=formateofecha.format(nuevocalendario.getTime());
	   						 System.out.println("el dia es:"+diax+""+"y la nueva fecha es **j:"+newdate);
	   					}
	   					if(diax.equals("sáb")&&  diaaprobacion+1==diamarzo ) {
	   					    SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
	   						 nuevocalendario.add(Calendar.DATE, 10);
	   						  newdate=formateofecha.format(nuevocalendario.getTime());
	   						 System.out.println("el dia es:"+diax+""+"y la nueva fecha es:"+newdate);
	   					}
	   					//-----------------------------------fin validacion dias que se cruzan con el 23 de marzo-----------------------------------------//		
	   					
                       //----------------------------------dias normales antes del 23 de marzo---------------//
	   				    if(diax.equals("lun")&& diaaprobacion==diamarzot) {
	   					    SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
		   					 nuevocalendario.add(Calendar.DATE, 9);
		   					  newdate=formateofecha.format(nuevocalendario.getTime());
		   					 System.out.println("el dia es:"+diax+""+"y la nueva fecha es:"+newdate);
	   					   }
	   				    if(diax.equals("mar")&& diaaprobacion==diamarzot) {
	   					    SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
		   					 nuevocalendario.add(Calendar.DATE, 9);
		   					  newdate=formateofecha.format(nuevocalendario.getTime());
		   					 System.out.println("el dia es:"+diax+""+"y la nueva fecha a es fff:"+newdate);
	   					   }
	   				  if(diax.equals("mié")&& diaaprobacion==diamarzot) {
	   					    SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
		   					 nuevocalendario.add(Calendar.DATE, 9);
		   					  newdate=formateofecha.format(nuevocalendario.getTime());
		   					 System.out.println("el dia es:"+diax+""+"y la nueva fecha a es:"+newdate);
	   					   }
	   				  if(diax.equals("jue")&& diaaprobacion==diamarzot) {
	   					    SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
		   					 nuevocalendario.add(Calendar.DATE, 9);
		   					  newdate=formateofecha.format(nuevocalendario.getTime());
		   					 System.out.println("el dia es:"+diax+""+"y la nueva fecha a es:"+newdate);
	   					   }
	   				  if(diax.equals("vie")&& diaaprobacion==diamarzot) {
	   					    SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
		   					 nuevocalendario.add(Calendar.DATE, 10);
		   					  newdate=formateofecha.format(nuevocalendario.getTime());
		   					 System.out.println("el dia es:"+diax+""+"y la nueva fecha a es **k:"+newdate);
	   					   }
	   				  if(diax.equals("sáb")&& diaaprobacion==diamarzot) {
	   					    SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
		   					 nuevocalendario.add(Calendar.DATE, 10);
		   					  newdate=formateofecha.format(nuevocalendario.getTime());
		   					 System.out.println("el dia es:"+diax+""+"y la nueva fecha a es:"+newdate);
	   					   }
	   				  //----------------------------------fin dias normales antes del 23 de marzo---------------//
	   				  
	   				  //------------------------------dias normales despues del 23 de marzo y antes del 31-------------------------//
	   				  if(diax.equals("lun")&& diaaprobacion==diamarzod) {
	   					    SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
		   					 nuevocalendario.add(Calendar.DATE, 9);
		   					  newdate=formateofecha.format(nuevocalendario.getTime());
		   					 System.out.println("el dia es:"+diax+""+"y la nueva fecha a es:"+newdate);
	   					   }
	   				  if(diax.equals("mar")&& diaaprobacion==diamarzod) {
	   					    SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
		   					 nuevocalendario.add(Calendar.DATE, 9);
		   					  newdate=formateofecha.format(nuevocalendario.getTime());
		   					 System.out.println("el dia es:"+diax+""+"y la nueva fecha a es xf:"+newdate);
	   					   }
	   				  if(diax.equals("mié")&& diaaprobacion==diamarzod) {
	   					    SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
		   					 nuevocalendario.add(Calendar.DATE, 9);
		   					  newdate=formateofecha.format(nuevocalendario.getTime());
		   					 System.out.println("el dia es:"+diax+""+"y la nueva fecha a es:"+newdate);
	   					   }
	   				  if(diax.equals("jue")&& diaaprobacion==diamarzod) {
	   					    SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
		   					 nuevocalendario.add(Calendar.DATE, 9);
		   					  newdate=formateofecha.format(nuevocalendario.getTime());
		   					 System.out.println("el dia es:"+diax+""+"y la nueva fecha a es:"+newdate);
	   					   }
	   				 if(diax.equals("vie")&& diaaprobacion==diamarzod) {
	   					    SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
		   					 nuevocalendario.add(Calendar.DATE, 10);
		   					  newdate=formateofecha.format(nuevocalendario.getTime());
		   					 System.out.println("el dia es:"+diax+""+"y la nueva fecha a es **aa:"+newdate);
	   					   }
	   				 if(diax.equals("sáb")&& diaaprobacion==diamarzod) {
	   					    SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
		   					 nuevocalendario.add(Calendar.DATE, 10);
		   					  newdate=formateofecha.format(nuevocalendario.getTime());
		   					 System.out.println("el dia es:"+diax+""+"y la nueva fecha a es:"+newdate);
	   					   }
	   				 //------------------------------fin dias normales despues del 23 de marzo y antes del 31-------------------------//
	   				 
	   		
	   				 
	   			//------------------------fin validacion dias que se cruzan con los festivos abril-----//
	   				 if(diax.equals("lun")&& diaaprobacion+9==diaabrilf) {
   					    SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
	   					 nuevocalendario.add(Calendar.DATE, 11);
	   					  newdate=formateofecha.format(nuevocalendario.getTime());
	   					 System.out.println("el dia es:"+diax+""+"y la nueva fecha es:"+newdate);
   					}
	   				if(diax.equals("lun")&& diaaprobacion+8==diaabrilf) {
   					    SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
	   					 nuevocalendario.add(Calendar.DATE, 11);
	   					  newdate=formateofecha.format(nuevocalendario.getTime());
	   					 System.out.println("el dia es:"+diax+""+"y la nueva fecha es:"+newdate);
   					}
	   				if(diax.equals("lun")&& diaaprobacion+7==diaabrilf) {
   					    SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
	   					 nuevocalendario.add(Calendar.DATE, 10);
	   					  newdate=formateofecha.format(nuevocalendario.getTime());
	   					 System.out.println("el dia es:"+diax+""+"y la nueva fecha es:"+newdate);
   					}
	   				if(diax.equals("lun")&& diaaprobacion+6==diaabrilf) {
   					    SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
	   					 nuevocalendario.add(Calendar.DATE, 10);
	   					  newdate=formateofecha.format(nuevocalendario.getTime());
	   					 System.out.println("el dia es:"+diax+""+"y la nueva fecha es:"+newdate);
   					}
	   				if(diax.equals("lun")&& diaaprobacion+5==diaabrilf) {
   					    SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
	   					 nuevocalendario.add(Calendar.DATE, 11);
	   					  newdate=formateofecha.format(nuevocalendario.getTime());
	   					 System.out.println("el dia es:"+diax+""+"y la nueva fecha es:"+newdate);
   					}
	   				if(diax.equals("lun")&& diaaprobacion+4==diaabrilf) {
   					    SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
	   					 nuevocalendario.add(Calendar.DATE, 11);
	   					  newdate=formateofecha.format(nuevocalendario.getTime());
	   					 System.out.println("el dia es:"+diax+""+"y la nueva fecha es:"+newdate);
   					}
	   				if(diax.equals("lun")&& diaaprobacion+3==diaabrilf) {
   					    SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
	   					 nuevocalendario.add(Calendar.DATE, 11);
	   					  newdate=formateofecha.format(nuevocalendario.getTime());
	   					 System.out.println("el dia es:"+diax+""+"y la nueva fecha es:"+newdate);
   					}
	   				if(diax.equals("lun")&& diaaprobacion+2==diaabrilf) {
   					    SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
	   					 nuevocalendario.add(Calendar.DATE, 11);
	   					  newdate=formateofecha.format(nuevocalendario.getTime());
	   					 System.out.println("el dia es:"+diax+""+"y la nueva fecha es:"+newdate);
   					}	
	   			 if(diax.equals("mar")&& diaaprobacion+9==diaabrilf) {
					    SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
	   					 nuevocalendario.add(Calendar.DATE, 11);
	   					  newdate=formateofecha.format(nuevocalendario.getTime());
	   					 System.out.println("el dia es:"+diax+""+"y la nueva fecha es aa:"+newdate);
					}
	   			 if(diax.equals("mar")&& diaaprobacion+8==diaabrilf) {
					    SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
	   					 nuevocalendario.add(Calendar.DATE, 11);
	   					  newdate=formateofecha.format(nuevocalendario.getTime());
	   					 System.out.println("el dia es:"+diax+""+"y la nueva fecha es bb:"+newdate);
					}
	   			 if(diax.equals("mar")&& diaaprobacion+7==diaabrilf) {
					    SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
	   					 nuevocalendario.add(Calendar.DATE, 11);
	   					  newdate=formateofecha.format(nuevocalendario.getTime());
	   					 System.out.println("el dia es:"+diax+""+"y la nueva fecha es cc:"+newdate);
					}
	   				
	   			 if(diax.equals("mar")&& diaaprobacion+6==diaabrilf) {
					    SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
	   					 nuevocalendario.add(Calendar.DATE, 10);
	   					  newdate=formateofecha.format(nuevocalendario.getTime());
	   					 System.out.println("el dia es:"+diax+""+"y la nueva fecha es dd:"+newdate);
					}
	   			 if(diax.equals("mar")&& diaaprobacion+5==diaabrilf) {
					    SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
	   					 nuevocalendario.add(Calendar.DATE, 10);
	   					  newdate=formateofecha.format(nuevocalendario.getTime());
	   					 System.out.println("el dia es:"+diax+""+"y la nueva fecha es ee:"+newdate);
					}
	   			 if(diax.equals("mar")&& diaaprobacion+4==diaabrilf) {
					    SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
	   					 nuevocalendario.add(Calendar.DATE, 11);
	   					  newdate=formateofecha.format(nuevocalendario.getTime());
	   					 System.out.println("el dia es:"+diax+""+"y la nueva fecha es ff:"+newdate);
					}
	   				
	   			 if(diax.equals("mar")&& diaaprobacion+3==diaabrilf) {
					    SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
	   					 nuevocalendario.add(Calendar.DATE, 11);
	   					  newdate=formateofecha.format(nuevocalendario.getTime());
	   					 System.out.println("el dia es:"+diax+""+"y la nueva fecha es gg:"+newdate);
					}
	   				
	   			 if(diax.equals("mar")&& diaaprobacion+2==diaabrilf) {
					    SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
	   					 nuevocalendario.add(Calendar.DATE, 11);
	   					  newdate=formateofecha.format(nuevocalendario.getTime());
	   					 System.out.println("el dia es:"+diax+""+"y la nueva fecha es hh:"+newdate);
					}

	   				if(diax.equals("mié")&& diaaprobacion+9==diaabrilf) {
   					    SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
	   					 nuevocalendario.add(Calendar.DATE, 12);
	   					  newdate=formateofecha.format(nuevocalendario.getTime());
	   					 System.out.println("el dia es:"+diax+""+"y la nueva fecha xxdd es:"+newdate);
   					}
	   				if(diax.equals("mié")&& diaaprobacion+8==diaabrilf) {
   					    SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
	   					 nuevocalendario.add(Calendar.DATE, 12);
	   					  newdate=formateofecha.format(nuevocalendario.getTime());
	   					 System.out.println("el dia es:"+diax+""+"y la nueva fecha xxdd es:"+newdate);
   					}
	   				if(diax.equals("mié")&& diaaprobacion+7==diaabrilf) {
   					    SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
	   					 nuevocalendario.add(Calendar.DATE, 12);
	   					  newdate=formateofecha.format(nuevocalendario.getTime());
	   					 System.out.println("el dia es:"+diax+""+"y la nueva fecha xxdd es:"+newdate);
   					}
	   				if(diax.equals("mié")&& diaaprobacion+6==diaabrilf) {
   					    SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
	   					 nuevocalendario.add(Calendar.DATE, 12);
	   					  newdate=formateofecha.format(nuevocalendario.getTime());
	   					 System.out.println("el dia es:"+diax+""+"y la nueva fecha xxdd es:"+newdate);
   					}
	   				if(diax.equals("mié")&& diaaprobacion+5==diaabrilf) {
   					    SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
	   					 nuevocalendario.add(Calendar.DATE, 10);
	   					  newdate=formateofecha.format(nuevocalendario.getTime());
	   					 System.out.println("el dia es:"+diax+""+"y la nueva fecha xxdd es:"+newdate);
   					}
	   				if(diax.equals("mié")&& diaaprobacion+4==diaabrilf) {
   					    SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
	   					 nuevocalendario.add(Calendar.DATE, 10);
	   					  newdate=formateofecha.format(nuevocalendario.getTime());
	   					 System.out.println("el dia es:"+diax+""+"y la nueva fecha xxdd es:"+newdate);
   					}
	   				if(diax.equals("mié")&& diaaprobacion+3==diaabrilf) {
   					    SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
	   					 nuevocalendario.add(Calendar.DATE, 12);
	   					  newdate=formateofecha.format(nuevocalendario.getTime());
	   					 System.out.println("el dia es:"+diax+""+"y la nueva fecha xxdd es:"+newdate);
   					}
	   				if(diax.equals("mié")&& diaaprobacion+2==diaabrilf) {
   					    SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
	   					 nuevocalendario.add(Calendar.DATE, 12);
	   					  newdate=formateofecha.format(nuevocalendario.getTime());
	   					 System.out.println("el dia es:"+diax+""+"y la nueva fecha xxdd es:"+newdate);
   					}
	   				
	   				if(diax.equals("jue")&& diaaprobacion+9==diaabrilf) {
   					    SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
	   					 nuevocalendario.add(Calendar.DATE, 12);
	   					  newdate=formateofecha.format(nuevocalendario.getTime());
	   					 System.out.println("el dia es:"+diax+""+"y la nueva fecha xxdd es b:"+newdate);
   					}
	   				
	   				if(diax.equals("jue")&& diaaprobacion+8==diaabrilf) {
   					    SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
	   					 nuevocalendario.add(Calendar.DATE, 12);
	   					  newdate=formateofecha.format(nuevocalendario.getTime());
	   					 System.out.println("el dia es:"+diax+""+"y la nueva fecha xxdd es c:"+newdate);
   					}
	   				
	   				if(diax.equals("jue")&& diaaprobacion+7==diaabrilf) {
   					    SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
	   					 nuevocalendario.add(Calendar.DATE, 12);
	   					  newdate=formateofecha.format(nuevocalendario.getTime());
	   					 System.out.println("el dia es:"+diax+""+"y la nueva fecha xxdd es d:"+newdate);
   					}
	   				if(diax.equals("jue")&& diaaprobacion+6==diaabrilf) {
   					    SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
	   					 nuevocalendario.add(Calendar.DATE, 12);
	   					  newdate=formateofecha.format(nuevocalendario.getTime());
	   					 System.out.println("el dia es:"+diax+""+"y la nueva fecha xxdd es :"+newdate);
   					}
	   				if(diax.equals("jue")&& diaaprobacion+5==diaabrilf) {
   					    SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
	   					 nuevocalendario.add(Calendar.DATE, 12);
	   					  newdate=formateofecha.format(nuevocalendario.getTime());
	   					 System.out.println("el dia es:"+diax+""+"y la nueva fecha xxdd es f:"+newdate);
   					}
	   				if(diax.equals("jue")&& diaaprobacion+4==diaabrilf) {
   					    SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
	   					 nuevocalendario.add(Calendar.DATE, 11);
	   					  newdate=formateofecha.format(nuevocalendario.getTime());
	   					 System.out.println("el dia es:"+diax+""+"y la nueva fecha xxdd es g:"+newdate);
   					}
	   				if(diax.equals("jue")&& diaaprobacion+3==diaabrilf) {
   					    SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
	   					 nuevocalendario.add(Calendar.DATE, 11);
	   					  newdate=formateofecha.format(nuevocalendario.getTime());
	   					 System.out.println("el dia es:"+diax+""+"y la nueva fecha xxdd es h:"+newdate);
   					}
	   				if(diax.equals("jue")&& diaaprobacion+2==diaabrilf) {
   					    SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
	   					 nuevocalendario.add(Calendar.DATE, 12);
	   					  newdate=formateofecha.format(nuevocalendario.getTime());
	   					 System.out.println("el dia es:"+diax+""+"y la nueva fecha xxdd es i:"+newdate);
   					}
	   				if(diax.equals("vie")&& diaaprobacion+9==diaabrilf) {
					 SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
   					 nuevocalendario.add(Calendar.DATE, 11);
   					  newdate=formateofecha.format(nuevocalendario.getTime());
   					 System.out.println("el dia es:"+diax+""+"y la nueva fecha es:"+newdate);
					}
	   				if(diax.equals("vie")&& diaaprobacion+8==diaabrilf) {
						 SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
	   					 nuevocalendario.add(Calendar.DATE, 12);
	   					  newdate=formateofecha.format(nuevocalendario.getTime());
	   					 System.out.println("el dia es:"+diax+""+"y la nueva fecha es:"+newdate);
						}
	   				if(diax.equals("vie")&& diaaprobacion+7==diaabrilf) {
						 SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
	   					 nuevocalendario.add(Calendar.DATE, 12);
	   					  newdate=formateofecha.format(nuevocalendario.getTime());
	   					 System.out.println("el dia es:"+diax+""+"y la nueva fecha es:"+newdate);
						}
	   				if(diax.equals("vie")&& diaaprobacion+6==diaabrilf) {
						 SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
	   					 nuevocalendario.add(Calendar.DATE, 12);
	   					  newdate=formateofecha.format(nuevocalendario.getTime());
	   					 System.out.println("el dia es:"+diax+""+"y la nueva fecha es:"+newdate);
						}
	   				if(diax.equals("vie")&& diaaprobacion+5==diaabrilf) {
						 SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
	   					 nuevocalendario.add(Calendar.DATE, 12);
	   					  newdate=formateofecha.format(nuevocalendario.getTime());
	   					 System.out.println("el dia es:"+diax+""+"y la nueva fecha es:"+newdate);
						}
	   				if(diax.equals("vie")&& diaaprobacion+4==diaabrilf) {
						 SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
	   					 nuevocalendario.add(Calendar.DATE, 12);
	   					  newdate=formateofecha.format(nuevocalendario.getTime());
	   					 System.out.println("el dia es:"+diax+""+"y la nueva fecha es:"+newdate);
						}
	   				if(diax.equals("vie")&& diaaprobacion+3==diaabrilf) {
						 SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
	   					 nuevocalendario.add(Calendar.DATE, 11);
	   					  newdate=formateofecha.format(nuevocalendario.getTime());
	   					 System.out.println("el dia es:"+diax+""+"y la nueva fecha es:"+newdate);
						}
	   				if(diax.equals("vie")&& diaaprobacion+2==diaabrilf) {
						 SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
	   					 nuevocalendario.add(Calendar.DATE, 11);
	   					  newdate=formateofecha.format(nuevocalendario.getTime());
	   					 System.out.println("el dia es:"+diax+""+"y la nueva fecha es:"+newdate);
						}
	
	   				if(diax.equals("sáb")&& diaaprobacion+9==diaabrilf) {
						 SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
	   					 nuevocalendario.add(Calendar.DATE, 11);
	   					  newdate=formateofecha.format(nuevocalendario.getTime());
	   					 System.out.println("el dia es:"+diax+""+"y la nueva fecha es:"+newdate);
						}
	   				if(diax.equals("sáb")&& diaaprobacion+8==diaabrilf) {
						 SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
	   					 nuevocalendario.add(Calendar.DATE, 11);
	   					  newdate=formateofecha.format(nuevocalendario.getTime());
	   					 System.out.println("el dia es:"+diax+""+"y la nueva fecha es:"+newdate);
						}
	   				if(diax.equals("sáb")&& diaaprobacion+7==diaabrilf) {
						 SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
	   					 nuevocalendario.add(Calendar.DATE, 12);
	   					  newdate=formateofecha.format(nuevocalendario.getTime());
	   					 System.out.println("el dia es:"+diax+""+"y la nueva fecha es:"+newdate);
						}
	   				if(diax.equals("sáb")&& diaaprobacion+6==diaabrilf) {
						 SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
	   					 nuevocalendario.add(Calendar.DATE, 12);
	   					  newdate=formateofecha.format(nuevocalendario.getTime());
	   					 System.out.println("el dia es:"+diax+""+"y la nueva fecha es:"+newdate);
						}
	   				if(diax.equals("sáb")&& diaaprobacion+5==diaabrilf) {
						 SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
	   					 nuevocalendario.add(Calendar.DATE, 12);
	   					  newdate=formateofecha.format(nuevocalendario.getTime());
	   					 System.out.println("el dia es:"+diax+""+"y la nueva fecha es:"+newdate);
						}
	   				if(diax.equals("sáb")&& diaaprobacion+4==diaabrilf) {
						 SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
	   					 nuevocalendario.add(Calendar.DATE, 12);
	   					  newdate=formateofecha.format(nuevocalendario.getTime());
	   					 System.out.println("el dia es:"+diax+""+"y la nueva fecha es:"+newdate);
						}
	   				if(diax.equals("sáb")&& diaaprobacion+3==diaabrilf) {
						 SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
	   					 nuevocalendario.add(Calendar.DATE, 12);
	   					  newdate=formateofecha.format(nuevocalendario.getTime());
	   					 System.out.println("el dia es:"+diax+""+"y la nueva fecha es:"+newdate);
						}
	   				if(diax.equals("sáb")&& diaaprobacion+2==diaabrilf) {
						 SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
	   					 nuevocalendario.add(Calendar.DATE, 11);
	   					  newdate=formateofecha.format(nuevocalendario.getTime());
	   					 System.out.println("el dia es:"+diax+""+"y la nueva fecha es:"+newdate);
						}
	   				
	   				//------------------------fin validacion dias que se cruzan con los festivos abril-----//
	   				
	   			//----------------dias normales despues de los festivo-----------------------------//	
	   			 if(diax.equals("lun")&& diaaprobacion==diaabrilf) {
					    SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
	   					 nuevocalendario.add(Calendar.DATE, 9);
	   					  newdate=formateofecha.format(nuevocalendario.getTime());
	   					 System.out.println("el dia es:"+diax+""+"y la nueva fecha es:"+newdate);
					   }
	   			 if(diax.equals("mar")&& diaaprobacion==diaabrilf) {
					    SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
	   					 nuevocalendario.add(Calendar.DATE, 9);
	   					  newdate=formateofecha.format(nuevocalendario.getTime());
	   					 System.out.println("el dia es:"+diax+""+"y la nueva fecha es jj:"+newdate);
					   }
	   			 if(diax.equals("mié")&& diaaprobacion==diaabrilf) {
					    SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
	   					 nuevocalendario.add(Calendar.DATE, 9);
	   					  newdate=formateofecha.format(nuevocalendario.getTime());
	   					 System.out.println("el dia es:"+diax+""+"y la nueva fecha es:"+newdate);
					   }
	   			 if(diax.equals("jue")&& diaaprobacion==diaabrilf) {
					    SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
	   					 nuevocalendario.add(Calendar.DATE, 9);
	   					  newdate=formateofecha.format(nuevocalendario.getTime());
	   					 System.out.println("el dia es:"+diax+""+"y la nueva fecha es:"+newdate);
					   }
	   			if(diax.equals("vie")&& diaaprobacion==diaabrilf) {
				    SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
   					 nuevocalendario.add(Calendar.DATE, 10);
   					  newdate=formateofecha.format(nuevocalendario.getTime());
   					 System.out.println("el dia es:"+diax+""+"y la nueva fecha es:"+newdate);
				   }
	   			if(diax.equals("sáb")&& diaaprobacion==diaabrilf) {
				    SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
   					 nuevocalendario.add(Calendar.DATE, 10);
   					  newdate=formateofecha.format(nuevocalendario.getTime());
   					 System.out.println("el dia es:"+diax+""+"y la nueva fecha es aa:"+newdate);
				   }
	   			
	 
	
	   			
	   	//---------------------------------------dia 22 de abril--------------------------------------//
	   			if( ((diax.equals("lun") && mifechaf1.equals(mifechaf2) && fecha2.compareTo(mifecha)>0 && diaaprobacion==diaabrilmayo && mesactual==mesAbril && abril22.equals(fechaaproformateada))) || (diax.equals("lun") && mifechaf1.equals(mifechaf2) && fecha2.compareTo(mifecha)>0 && diaaprobacion==diaabrilmayo && mesactual==mesMAyo && abril22.equals(fechaaproformateada)) ) {	
	   				Calendar cal4 = new GregorianCalendar();  
 					SimpleDateFormat miformatf = new SimpleDateFormat("yyyy-MM-dd");
 					cal4 = Calendar.getInstance(); 
 					cal4.setTime(mifecha);
				    cal4.add(Calendar.DATE, 10);
				    newdate=miformatf.format(cal4.getTime());
				 System.out.println("el dia es:"+diax+""+"y la nueva fecha es:"+newdate);
			   }
	   			if( ((diax.equals("mar") && mifechaf1.equals(mifechaf2) && fecha2.compareTo(mifecha)>0 && diaaprobacion==diaabrilmayo && mesactual==mesAbril && abril22.equals(fechaaproformateada))) || (diax.equals("mar") && mifechaf1.equals(mifechaf2) && fecha2.compareTo(mifecha)>0 && diaaprobacion==diaabrilmayo && mesactual==mesMAyo && abril22.equals(fechaaproformateada)) ) {	
	   				Calendar cal4 = new GregorianCalendar();  
 					SimpleDateFormat miformatf = new SimpleDateFormat("yyyy-MM-dd");
 					cal4 = Calendar.getInstance(); 
 					cal4.setTime(mifecha);
				    cal4.add(Calendar.DATE, 10);
				    newdate=miformatf.format(cal4.getTime());
				 System.out.println("el dia es:"+diax+""+"y la nueva fecha es:"+newdate);
			   }
	   			if( ((diax.equals("mié") && mifechaf1.equals(mifechaf2) && fecha2.compareTo(mifecha)>0 && diaaprobacion==diaabrilmayo && mesactual==mesAbril && abril22.equals(fechaaproformateada))) || (diax.equals("mié") && mifechaf1.equals(mifechaf2) && fecha2.compareTo(mifecha)>0 && diaaprobacion==diaabrilmayo && mesactual==mesMAyo && abril22.equals(fechaaproformateada)) ) {	
	   				Calendar cal4 = new GregorianCalendar();  
 					SimpleDateFormat miformatf = new SimpleDateFormat("yyyy-MM-dd");
 					cal4 = Calendar.getInstance(); 
 					cal4.setTime(mifecha);
				    cal4.add(Calendar.DATE, 10);
				    newdate=miformatf.format(cal4.getTime());
				 System.out.println("el dia es:"+diax+""+"y la nueva fecha es:"+newdate);
			   }
	   			if( ((diax.equals("jue") && mifechaf1.equals(mifechaf2) && fecha2.compareTo(mifecha)>0 && diaaprobacion==diaabrilmayo && mesactual==mesAbril && abril22.equals(fechaaproformateada))) || (diax.equals("jue") && mifechaf1.equals(mifechaf2) && fecha2.compareTo(mifecha)>0 && diaaprobacion==diaabrilmayo && mesactual==mesMAyo && abril22.equals(fechaaproformateada)) ) {	
	   				Calendar cal4 = new GregorianCalendar();  
 					SimpleDateFormat miformatf = new SimpleDateFormat("yyyy-MM-dd");
 					cal4 = Calendar.getInstance(); 
 					cal4.setTime(mifecha);
				    cal4.add(Calendar.DATE, 11);
				    newdate=miformatf.format(cal4.getTime());
				 System.out.println("el dia es:"+diax+""+"y la nueva fecha es:"+newdate);
			   }
	   			if( ((diax.equals("vie") && mifechaf1.equals(mifechaf2) && fecha2.compareTo(mifecha)>0 && diaaprobacion==diaabrilmayo && mesactual==mesAbril && abril22.equals(fechaaproformateada))) || (diax.equals("vie") && mifechaf1.equals(mifechaf2) && fecha2.compareTo(mifecha)>0 && diaaprobacion==diaabrilmayo && mesactual==mesMAyo && abril22.equals(fechaaproformateada)) ) {	
	   				Calendar cal4 = new GregorianCalendar();  
 					SimpleDateFormat miformatf = new SimpleDateFormat("yyyy-MM-dd");
 					cal4 = Calendar.getInstance(); 
 					cal4.setTime(mifecha);
				    cal4.add(Calendar.DATE, 10);
				    newdate=miformatf.format(cal4.getTime());
				 System.out.println("el dia es:"+diax+""+"y la nueva fecha es:"+newdate);
			   }
	   			if( ((diax.equals("sáb") && mifechaf1.equals(mifechaf2) && fecha2.compareTo(mifecha)>0 && diaaprobacion==diaabrilmayo && mesactual==mesAbril && abril22.equals(fechaaproformateada))) || (diax.equals("sáb") && mifechaf1.equals(mifechaf2) && fecha2.compareTo(mifecha)>0 && diaaprobacion==diaabrilmayo && mesactual==mesMAyo && abril22.equals(fechaaproformateada)) ) {	
	   				Calendar cal4 = new GregorianCalendar();  
 					SimpleDateFormat miformatf = new SimpleDateFormat("yyyy-MM-dd");
 					cal4 = Calendar.getInstance(); 
 					cal4.setTime(mifecha);
				    cal4.add(Calendar.DATE, 11);
				    newdate=miformatf.format(cal4.getTime());
				 System.out.println("el dia es:"+diax+""+"y la nueva fecha es:"+newdate);
			   }
	   		 	//---------------------------------------fin dia 22 de abril--------------------------------------//
	   			
	   			
	   			
	   			//-----------------------------------23 de abril---------------------------------------------------//
	   			if( ((diax.equals("lun") && mifechaf1.equals(mifechaf2) && fecha2.compareTo(mifecha)>0 && diaaprobacion==diaabrilmayo && mesactual==mesAbril && abril23.equals(fechaaproformateada))) || (diax.equals("lun") && mifechaf1.equals(mifechaf2) && fecha2.compareTo(mifecha)>0 && diaaprobacion==diaabrilmayo && mesactual==mesMAyo && abril23.equals(fechaaproformateada)) ) {	
	   				Calendar cal4 = new GregorianCalendar();  
 					SimpleDateFormat miformatf = new SimpleDateFormat("yyyy-MM-dd");
 					cal4 = Calendar.getInstance(); 
 					cal4.setTime(mifecha);
				    cal4.add(Calendar.DATE, 10);
				    newdate=miformatf.format(cal4.getTime());
				 System.out.println("el dia es:"+diax+""+"y la nueva fecha es:"+newdate);
			   }
	   			if( ((diax.equals("mar") && mifechaf1.equals(mifechaf2) && fecha2.compareTo(mifecha)>0 && diaaprobacion==diaabrilmayo && mesactual==mesAbril && abril23.equals(fechaaproformateada))) || (diax.equals("mar") && mifechaf1.equals(mifechaf2) && fecha2.compareTo(mifecha)>0 && diaaprobacion==diaabrilmayo && mesactual==mesMAyo && abril23.equals(fechaaproformateada)) ) {	
	   				Calendar cal4 = new GregorianCalendar();  
 					SimpleDateFormat miformatf = new SimpleDateFormat("yyyy-MM-dd");
 					cal4 = Calendar.getInstance(); 
 					cal4.setTime(mifecha);
				    cal4.add(Calendar.DATE, 10);
				    newdate=miformatf.format(cal4.getTime());
				 System.out.println("el dia es:"+diax+""+"y la nueva fecha es:"+newdate);
			   }
	   			if( ((diax.equals("mié") && mifechaf1.equals(mifechaf2) && fecha2.compareTo(mifecha)>0 && diaaprobacion==diaabrilmayo && mesactual==mesAbril && abril23.equals(fechaaproformateada))) || (diax.equals("mié") && mifechaf1.equals(mifechaf2) && fecha2.compareTo(mifecha)>0 && diaaprobacion==diaabrilmayo && mesactual==mesMAyo && abril23.equals(fechaaproformateada)) ) {	
	   				Calendar cal4 = new GregorianCalendar();  
 					SimpleDateFormat miformatf = new SimpleDateFormat("yyyy-MM-dd");
 					cal4 = Calendar.getInstance(); 
 					cal4.setTime(mifecha);
				    cal4.add(Calendar.DATE, 10);
				    newdate=miformatf.format(cal4.getTime());
				 System.out.println("el dia es:"+diax+""+"y la nueva fecha es:"+newdate);
			   }
	   			if( ((diax.equals("jue") && mifechaf1.equals(mifechaf2) && fecha2.compareTo(mifecha)>0 && diaaprobacion==diaabrilmayo && mesactual==mesAbril && abril23.equals(fechaaproformateada))) || (diax.equals("jue") && mifechaf1.equals(mifechaf2) && fecha2.compareTo(mifecha)>0 && diaaprobacion==diaabrilmayo && mesactual==mesMAyo && abril23.equals(fechaaproformateada)) ) {	
	   				Calendar cal4 = new GregorianCalendar();  
 					SimpleDateFormat miformatf = new SimpleDateFormat("yyyy-MM-dd");
 					cal4 = Calendar.getInstance(); 
 					cal4.setTime(mifecha);
				    cal4.add(Calendar.DATE, 11);
				    newdate=miformatf.format(cal4.getTime());
				 System.out.println("el dia es:"+diax+""+"y la nueva fecha es:"+newdate);
			   }
	   			if( ((diax.equals("vie") && mifechaf1.equals(mifechaf2) && fecha2.compareTo(mifecha)>0 && diaaprobacion==diaabrilmayo && mesactual==mesAbril && abril23.equals(fechaaproformateada))) || (diax.equals("vie") && mifechaf1.equals(mifechaf2) && fecha2.compareTo(mifecha)>0 && diaaprobacion==diaabrilmayo && mesactual==mesMAyo && abril23.equals(fechaaproformateada)) ) {	
	   				Calendar cal4 = new GregorianCalendar();  
 					SimpleDateFormat miformatf = new SimpleDateFormat("yyyy-MM-dd");
 					cal4 = Calendar.getInstance(); 
 					cal4.setTime(mifecha);
				    cal4.add(Calendar.DATE, 11);
				    newdate=miformatf.format(cal4.getTime());
				 System.out.println("el dia es:"+diax+""+"y la nueva fecha es:"+newdate);
			   }
	   			if( ((diax.equals("sáb") && mifechaf1.equals(mifechaf2) && fecha2.compareTo(mifecha)>0 && diaaprobacion==diaabrilmayo && mesactual==mesAbril && abril23.equals(fechaaproformateada))) || (diax.equals("sáb") && mifechaf1.equals(mifechaf2) && fecha2.compareTo(mifecha)>0 && diaaprobacion==diaabrilmayo && mesactual==mesMAyo && abril23.equals(fechaaproformateada)) ) {	
	   				Calendar cal4 = new GregorianCalendar();  
 					SimpleDateFormat miformatf = new SimpleDateFormat("yyyy-MM-dd");
 					cal4 = Calendar.getInstance(); 
 					cal4.setTime(mifecha);
				    cal4.add(Calendar.DATE, 10);
				    newdate=miformatf.format(cal4.getTime());
				 System.out.println("el dia es:"+diax+""+"y la nueva fecha es:"+newdate);
			   }
	   			
	   		//-----------------------------------fin 23 de abril---------------------------------------------------//
	   			
	   			
	   			//-------------------24 de abril------------------------//
	   			if( ((diax.equals("lun") && mifechaf1.equals(mifechaf2) && fecha2.compareTo(mifecha)>0 && diaaprobacion==diaabrilmayo && mesactual==mesAbril && abril24.equals(fechaaproformateada))) || (diax.equals("lun") && mifechaf1.equals(mifechaf2) && fecha2.compareTo(mifecha)>0 && diaaprobacion==diaabrilmayo && mesactual==mesMAyo && abril24.equals(fechaaproformateada)) ) {	
	   				Calendar cal4 = new GregorianCalendar();  
 					SimpleDateFormat miformatf = new SimpleDateFormat("yyyy-MM-dd");
 					cal4 = Calendar.getInstance(); 
 					cal4.setTime(mifecha);
				    cal4.add(Calendar.DATE, 10);
				    newdate=miformatf.format(cal4.getTime());
				 System.out.println("el dia es:"+diax+""+"y la nueva fecha es:"+newdate);
			   }
	   			if( ((diax.equals("mar") && mifechaf1.equals(mifechaf2) && fecha2.compareTo(mifecha)>0 && diaaprobacion==diaabrilmayo && mesactual==mesAbril && abril24.equals(fechaaproformateada))) || (diax.equals("mar") && mifechaf1.equals(mifechaf2) && fecha2.compareTo(mifecha)>0 && diaaprobacion==diaabrilmayo && mesactual==mesMAyo && abril24.equals(fechaaproformateada)) ) {
	   				Calendar cal4 = new GregorianCalendar();  
 					SimpleDateFormat miformatf = new SimpleDateFormat("yyyy-MM-dd");
 					cal4 = Calendar.getInstance(); 
 					cal4.setTime(mifecha);
				    cal4.add(Calendar.DATE, 10);
				    newdate=miformatf.format(cal4.getTime());
				 System.out.println("el dia es:"+diax+""+"y la nueva fecha es:"+newdate);
			   }
	   			if( ((diax.equals("mié") && mifechaf1.equals(mifechaf2) && fecha2.compareTo(mifecha)>0 && diaaprobacion==diaabrilmayo && mesactual==mesAbril && abril24.equals(fechaaproformateada))) || (diax.equals("mié") && mifechaf1.equals(mifechaf2) && fecha2.compareTo(mifecha)>0 && diaaprobacion==diaabrilmayo && mesactual==mesMAyo && abril24.equals(fechaaproformateada)) ) {
	   				Calendar cal4 = new GregorianCalendar();  
 					SimpleDateFormat miformatf = new SimpleDateFormat("yyyy-MM-dd");
 					cal4 = Calendar.getInstance(); 
 					cal4.setTime(mifecha);
				    cal4.add(Calendar.DATE, 10);
				    newdate=miformatf.format(cal4.getTime());
				 System.out.println("el dia es:"+diax+""+"y la nueva fecha es:"+newdate);
			   }
	   			if( ((diax.equals("jue") && mifechaf1.equals(mifechaf2) && fecha2.compareTo(mifecha)>0 && diaaprobacion==diaabrilmayo && mesactual==mesAbril && abril24.equals(fechaaproformateada))) || (diax.equals("jue") && mifechaf1.equals(mifechaf2) && fecha2.compareTo(mifecha)>0 && diaaprobacion==diaabrilmayo && mesactual==mesMAyo && abril24.equals(fechaaproformateada)) ) {
	   				Calendar cal4 = new GregorianCalendar();  
 					SimpleDateFormat miformatf = new SimpleDateFormat("yyyy-MM-dd");
 					cal4 = Calendar.getInstance(); 
 					cal4.setTime(mifecha);
				    cal4.add(Calendar.DATE, 11);
				    newdate=miformatf.format(cal4.getTime());
				 System.out.println("el dia es:"+diax+""+"y la nueva fecha es:"+newdate);
			   }
	   			if( ((diax.equals("vie") && mifechaf1.equals(mifechaf2) && fecha2.compareTo(mifecha)>0 && diaaprobacion==diaabrilmayo && mesactual==mesAbril && abril24.equals(fechaaproformateada))) || (diax.equals("vie") && mifechaf1.equals(mifechaf2) && fecha2.compareTo(mifecha)>0 && diaaprobacion==diaabrilmayo && mesactual==mesMAyo && abril24.equals(fechaaproformateada)) ) {
	   				Calendar cal4 = new GregorianCalendar();  
 					SimpleDateFormat miformatf = new SimpleDateFormat("yyyy-MM-dd");
 					cal4 = Calendar.getInstance(); 
 					cal4.setTime(mifecha);
				    cal4.add(Calendar.DATE, 11);
				    newdate=miformatf.format(cal4.getTime());
				 System.out.println("el dia es:"+diax+""+"y la nueva fecha es:"+newdate);
			   }
	   			if( ((diax.equals("sáb") && mifechaf1.equals(mifechaf2) && fecha2.compareTo(mifecha)>0 && diaaprobacion==diaabrilmayo && mesactual==mesAbril && abril24.equals(fechaaproformateada))) || (diax.equals("sáb") && mifechaf1.equals(mifechaf2) && fecha2.compareTo(mifecha)>0 && diaaprobacion==diaabrilmayo && mesactual==mesMAyo && abril24.equals(fechaaproformateada)) ) {
	   				Calendar cal4 = new GregorianCalendar();  
 					SimpleDateFormat miformatf = new SimpleDateFormat("yyyy-MM-dd");
 					cal4 = Calendar.getInstance(); 
 					cal4.setTime(mifecha);
				    cal4.add(Calendar.DATE, 10);
				    newdate=miformatf.format(cal4.getTime());
				 System.out.println("el dia es:"+diax+""+"y la nueva fecha es:"+newdate);
			   }
	   			
	   		//---------------------fin 24 de abril--------------------------//
	   			
	   			
	   			//--------------------25 de abril---------------------------//
	   			if( ((diax.equals("lun") && mifechaf1.equals(mifechaf2) && fecha2.compareTo(mifecha)>0 && diaaprobacion==diaabrilmayo && mesactual==mesAbril && abril25.equals(fechaaproformateada))) || (diax.equals("lun") && mifechaf1.equals(mifechaf2) && fecha2.compareTo(mifecha)>0 && diaaprobacion==diaabrilmayo && mesactual==mesMAyo && abril25.equals(fechaaproformateada)) ) {
	   				Calendar cal4 = new GregorianCalendar();  
 					SimpleDateFormat miformatf = new SimpleDateFormat("yyyy-MM-dd");
 					cal4 = Calendar.getInstance(); 
 					cal4.setTime(mifecha);
				    cal4.add(Calendar.DATE, 9);
				    newdate=miformatf.format(cal4.getTime());
				 System.out.println("el dia es:"+diax+""+"y la nueva fecha es:"+newdate);
			   }
	   			if( ((diax.equals("mar") && mifechaf1.equals(mifechaf2) && fecha2.compareTo(mifecha)>0 && diaaprobacion==diaabrilmayo && mesactual==mesAbril && abril25.equals(fechaaproformateada))) || (diax.equals("mar") && mifechaf1.equals(mifechaf2) && fecha2.compareTo(mifecha)>0 && diaaprobacion==diaabrilmayo && mesactual==mesMAyo && abril25.equals(fechaaproformateada)) ) {
	   				Calendar cal4 = new GregorianCalendar();  
 					SimpleDateFormat miformatf = new SimpleDateFormat("yyyy-MM-dd");
 					cal4 = Calendar.getInstance(); 
 					cal4.setTime(mifecha);
				    cal4.add(Calendar.DATE, 10);
				    newdate=miformatf.format(cal4.getTime());
				 System.out.println("el dia es:"+diax+""+"y la nueva fecha es:"+newdate);
			   }
	   			if( ((diax.equals("mié") && mifechaf1.equals(mifechaf2) && fecha2.compareTo(mifecha)>0 && diaaprobacion==diaabrilmayo && mesactual==mesAbril && abril25.equals(fechaaproformateada))) || (diax.equals("mié") && mifechaf1.equals(mifechaf2) && fecha2.compareTo(mifecha)>0 && diaaprobacion==diaabrilmayo && mesactual==mesMAyo && abril25.equals(fechaaproformateada)) ) {
	   				Calendar cal4 = new GregorianCalendar();  
 					SimpleDateFormat miformatf = new SimpleDateFormat("yyyy-MM-dd");
 					cal4 = Calendar.getInstance(); 
 					cal4.setTime(mifecha);
				    cal4.add(Calendar.DATE, 10);
				    newdate=miformatf.format(cal4.getTime());
				 System.out.println("el dia es:"+diax+""+"y la nueva fecha es:"+newdate);
			   }
	   			if( ((diax.equals("jue") && mifechaf1.equals(mifechaf2) && fecha2.compareTo(mifecha)>0 && diaaprobacion==diaabrilmayo && mesactual==mesAbril && abril25.equals(fechaaproformateada))) || (diax.equals("jue") && mifechaf1.equals(mifechaf2) && fecha2.compareTo(mifecha)>0 && diaaprobacion==diaabrilmayo && mesactual==mesMAyo && abril25.equals(fechaaproformateada)) ) {
	   				Calendar cal4 = new GregorianCalendar();  
 					SimpleDateFormat miformatf = new SimpleDateFormat("yyyy-MM-dd");
 					cal4 = Calendar.getInstance(); 
 					cal4.setTime(mifecha);
				    cal4.add(Calendar.DATE, 11);
				    newdate=miformatf.format(cal4.getTime());
				 System.out.println("el dia es:"+diax+""+"y la nueva fecha es:"+newdate);
			   }
	   			if( ((diax.equals("vie") && mifechaf1.equals(mifechaf2) && fecha2.compareTo(mifecha)>0 && diaaprobacion==diaabrilmayo && mesactual==mesAbril && abril25.equals(fechaaproformateada))) || (diax.equals("vie") && mifechaf1.equals(mifechaf2) && fecha2.compareTo(mifecha)>0 && diaaprobacion==diaabrilmayo && mesactual==mesMAyo && abril25.equals(fechaaproformateada)) ) {
	   				Calendar cal4 = new GregorianCalendar();  
 					SimpleDateFormat miformatf = new SimpleDateFormat("yyyy-MM-dd");
 					cal4 = Calendar.getInstance(); 
 					cal4.setTime(mifecha);
				    cal4.add(Calendar.DATE, 11);
				    newdate=miformatf.format(cal4.getTime());
				 System.out.println("el dia es:"+diax+""+"y la nueva fecha es:"+newdate);
			   }
	   			if( ((diax.equals("sáb") && mifechaf1.equals(mifechaf2) && fecha2.compareTo(mifecha)>0 && diaaprobacion==diaabrilmayo && mesactual==mesAbril && abril25.equals(fechaaproformateada))) || (diax.equals("sáb") && mifechaf1.equals(mifechaf2) && fecha2.compareTo(mifecha)>0 && diaaprobacion==diaabrilmayo && mesactual==mesMAyo && abril25.equals(fechaaproformateada)) ) {
	   				Calendar cal4 = new GregorianCalendar();  
 					SimpleDateFormat miformatf = new SimpleDateFormat("yyyy-MM-dd");
 					cal4 = Calendar.getInstance(); 
 					cal4.setTime(mifecha);
				    cal4.add(Calendar.DATE, 11);
				    newdate=miformatf.format(cal4.getTime());
				 System.out.println("el dia es:"+diax+""+"y la nueva fecha es:"+newdate);
			   }
	   			
	   			//------------------fin 25 de abril-------------------------//
	   			
	   			
	   			//-------------------------26 de abril---------------------//
	   			
	   			if( ((diax.equals("lun") && mifechaf1.equals(mifechaf2) && fecha2.compareTo(mifecha)>0 && diaaprobacion==diaabrilmayo && mesactual==mesAbril && abril26.equals(fechaaproformateada))) || (diax.equals("lun") && mifechaf1.equals(mifechaf2) && fecha2.compareTo(mifecha)>0 && diaaprobacion==diaabrilmayo && mesactual==mesMAyo && abril26.equals(fechaaproformateada)) ) {
	   				Calendar cal4 = new GregorianCalendar();  
 					SimpleDateFormat miformatf = new SimpleDateFormat("yyyy-MM-dd");
 					cal4 = Calendar.getInstance(); 
 					cal4.setTime(mifecha);
				    cal4.add(Calendar.DATE, 10);
				    newdate=miformatf.format(cal4.getTime());
				 System.out.println("el dia es:"+diax+""+"y la nueva fecha es:"+newdate);
			   }
	   			
	   			if( ((diax.equals("mar") && mifechaf1.equals(mifechaf2) && fecha2.compareTo(mifecha)>0 && diaaprobacion==diaabrilmayo && mesactual==mesAbril && abril26.equals(fechaaproformateada))) || (diax.equals("mar") && mifechaf1.equals(mifechaf2) && fecha2.compareTo(mifecha)>0 && diaaprobacion==diaabrilmayo && mesactual==mesMAyo && abril26.equals(fechaaproformateada)) ) {
	   				Calendar cal4 = new GregorianCalendar();  
 					SimpleDateFormat miformatf = new SimpleDateFormat("yyyy-MM-dd");
 					cal4 = Calendar.getInstance(); 
 					cal4.setTime(mifecha);
				    cal4.add(Calendar.DATE, 9);
				    newdate=miformatf.format(cal4.getTime());
				 System.out.println("el dia es:"+diax+""+"y la nueva fecha es:"+newdate);
			   }
	   			if( ((diax.equals("mié") && mifechaf1.equals(mifechaf2) && fecha2.compareTo(mifecha)>0 && diaaprobacion==diaabrilmayo && mesactual==mesAbril && abril26.equals(fechaaproformateada))) || (diax.equals("mié") && mifechaf1.equals(mifechaf2) && fecha2.compareTo(mifecha)>0 && diaaprobacion==diaabrilmayo && mesactual==mesMAyo && abril26.equals(fechaaproformateada)) ) {
	   				Calendar cal4 = new GregorianCalendar();  
 					SimpleDateFormat miformatf = new SimpleDateFormat("yyyy-MM-dd");
 					cal4 = Calendar.getInstance(); 
 					cal4.setTime(mifecha);
				    cal4.add(Calendar.DATE,10);
				    newdate=miformatf.format(cal4.getTime());
				 System.out.println("el dia es:"+diax+""+"y la nueva fecha es:"+newdate);
			   }
	   			if( ((diax.equals("jue") && mifechaf1.equals(mifechaf2) && fecha2.compareTo(mifecha)>0 && diaaprobacion==diaabrilmayo && mesactual==mesAbril && abril26.equals(fechaaproformateada))) || (diax.equals("jue") && mifechaf1.equals(mifechaf2) && fecha2.compareTo(mifecha)>0 && diaaprobacion==diaabrilmayo && mesactual==mesMAyo && abril26.equals(fechaaproformateada)) ) {
	   				Calendar cal4 = new GregorianCalendar();  
 					SimpleDateFormat miformatf = new SimpleDateFormat("yyyy-MM-dd");
 					cal4 = Calendar.getInstance(); 
 					cal4.setTime(mifecha);
				    cal4.add(Calendar.DATE,11);
				    newdate=miformatf.format(cal4.getTime());
				 System.out.println("el dia es:"+diax+""+"y la nueva fecha es:"+newdate);
			   }
	   			if( ((diax.equals("vie") && mifechaf1.equals(mifechaf2) && fecha2.compareTo(mifecha)>0 && diaaprobacion==diaabrilmayo && mesactual==mesAbril && abril26.equals(fechaaproformateada))) || (diax.equals("vie") && mifechaf1.equals(mifechaf2) && fecha2.compareTo(mifecha)>0 && diaaprobacion==diaabrilmayo && mesactual==mesMAyo && abril26.equals(fechaaproformateada)) ) {
	   				Calendar cal4 = new GregorianCalendar();  
 					SimpleDateFormat miformatf = new SimpleDateFormat("yyyy-MM-dd");
 					cal4 = Calendar.getInstance(); 
 					cal4.setTime(mifecha);
				    cal4.add(Calendar.DATE,11);
				    newdate=miformatf.format(cal4.getTime());
				 System.out.println("el dia es:"+diax+""+"y la nueva fecha es:"+newdate);
			   }
	   			if( ((diax.equals("sáb") && mifechaf1.equals(mifechaf2) && fecha2.compareTo(mifecha)>0 && diaaprobacion==diaabrilmayo && mesactual==mesAbril && abril26.equals(fechaaproformateada))) || (diax.equals("sáb") && mifechaf1.equals(mifechaf2) && fecha2.compareTo(mifecha)>0 && diaaprobacion==diaabrilmayo && mesactual==mesMAyo && abril26.equals(fechaaproformateada)) ) {
	   				Calendar cal4 = new GregorianCalendar();  
 					SimpleDateFormat miformatf = new SimpleDateFormat("yyyy-MM-dd");
 					cal4 = Calendar.getInstance(); 
 					cal4.setTime(mifecha);
				    cal4.add(Calendar.DATE,11);
				    newdate=miformatf.format(cal4.getTime());
				 System.out.println("el dia es:"+diax+""+"y la nueva fecha es:"+newdate);
			   }
	   			
	   			//--------------fin 26 de abril-----------------------------//
	   			
	   			
	   			//----------------27 de abril-------------------------//
	   			if( ((diax.equals("lun") && mifechaf1.equals(mifechaf2) && fecha2.compareTo(mifecha)>0 && diaaprobacion==diaabrilmayo && mesactual==mesAbril && abril27.equals(fechaaproformateada))) || (diax.equals("lun") && mifechaf1.equals(mifechaf2) && fecha2.compareTo(mifecha)>0 && diaaprobacion==diaabrilmayo && mesactual==mesMAyo && abril27.equals(fechaaproformateada)) ) {
	   				Calendar cal4 = new GregorianCalendar();  
 					SimpleDateFormat miformatf = new SimpleDateFormat("yyyy-MM-dd");
 					cal4 = Calendar.getInstance(); 
 					cal4.setTime(mifecha);
				    cal4.add(Calendar.DATE, 10);
				    newdate=miformatf.format(cal4.getTime());
				 System.out.println("el dia es:"+diax+""+"y la nueva fecha es:"+newdate);
			   }
	   			if( ((diax.equals("mar") && mifechaf1.equals(mifechaf2) && fecha2.compareTo(mifecha)>0 && diaaprobacion==diaabrilmayo && mesactual==mesAbril && abril27.equals(fechaaproformateada))) || (diax.equals("mar") && mifechaf1.equals(mifechaf2) && fecha2.compareTo(mifecha)>0 && diaaprobacion==diaabrilmayo && mesactual==mesMAyo && abril27.equals(fechaaproformateada)) ) {
	   				Calendar cal4 = new GregorianCalendar();  
 					SimpleDateFormat miformatf = new SimpleDateFormat("yyyy-MM-dd");
 					cal4 = Calendar.getInstance(); 
 					cal4.setTime(mifecha);
				    cal4.add(Calendar.DATE, 10);
				    newdate=miformatf.format(cal4.getTime());
				 System.out.println("el dia es:"+diax+""+"y la nueva fecha es:"+newdate);
			   }
	   			if( ((diax.equals("mié") && mifechaf1.equals(mifechaf2) && fecha2.compareTo(mifecha)>0 && diaaprobacion==diaabrilmayo && mesactual==mesAbril && abril27.equals(fechaaproformateada))) || (diax.equals("mié") && mifechaf1.equals(mifechaf2) && fecha2.compareTo(mifecha)>0 && diaaprobacion==diaabrilmayo && mesactual==mesMAyo && abril27.equals(fechaaproformateada)) ) {
	   				Calendar cal4 = new GregorianCalendar();  
 					SimpleDateFormat miformatf = new SimpleDateFormat("yyyy-MM-dd");
 					cal4 = Calendar.getInstance(); 
 					cal4.setTime(mifecha);
				    cal4.add(Calendar.DATE, 9);
				    newdate=miformatf.format(cal4.getTime());
				 System.out.println("el dia es:"+diax+""+"y la nueva fecha es:"+newdate);
			   }
	   			if( ((diax.equals("jue") && mifechaf1.equals(mifechaf2) && fecha2.compareTo(mifecha)>0 && diaaprobacion==diaabrilmayo && mesactual==mesAbril && abril27.equals(fechaaproformateada))) || (diax.equals("jue") && mifechaf1.equals(mifechaf2) && fecha2.compareTo(mifecha)>0 && diaaprobacion==diaabrilmayo && mesactual==mesMAyo && abril27.equals(fechaaproformateada)) ) {
	   				Calendar cal4 = new GregorianCalendar();  
 					SimpleDateFormat miformatf = new SimpleDateFormat("yyyy-MM-dd");
 					cal4 = Calendar.getInstance(); 
 					cal4.setTime(mifecha);
				    cal4.add(Calendar.DATE, 11);
				    newdate=miformatf.format(cal4.getTime());
				 System.out.println("el dia es:"+diax+""+"y la nueva fecha es:"+newdate);
			   }
	   			if( ((diax.equals("vie") && mifechaf1.equals(mifechaf2) && fecha2.compareTo(mifecha)>0 && diaaprobacion==diaabrilmayo && mesactual==mesAbril && abril27.equals(fechaaproformateada))) || (diax.equals("vie") && mifechaf1.equals(mifechaf2) && fecha2.compareTo(mifecha)>0 && diaaprobacion==diaabrilmayo && mesactual==mesMAyo && abril27.equals(fechaaproformateada)) ) {
	   				Calendar cal4 = new GregorianCalendar();  
 					SimpleDateFormat miformatf = new SimpleDateFormat("yyyy-MM-dd");
 					cal4 = Calendar.getInstance(); 
 					cal4.setTime(mifecha);
				    cal4.add(Calendar.DATE, 11);
				    newdate=miformatf.format(cal4.getTime());
				 System.out.println("el dia es:"+diax+""+"y la nueva fecha es:"+newdate);
			   }
	   			if( ((diax.equals("sáb") && mifechaf1.equals(mifechaf2) && fecha2.compareTo(mifecha)>0 && diaaprobacion==diaabrilmayo && mesactual==mesAbril && abril27.equals(fechaaproformateada))) || (diax.equals("sáb") && mifechaf1.equals(mifechaf2) && fecha2.compareTo(mifecha)>0 && diaaprobacion==diaabrilmayo && mesactual==mesMAyo && abril27.equals(fechaaproformateada)) ) {
	   				Calendar cal4 = new GregorianCalendar();  
 					SimpleDateFormat miformatf = new SimpleDateFormat("yyyy-MM-dd");
 					cal4 = Calendar.getInstance(); 
 					cal4.setTime(mifecha);
				    cal4.add(Calendar.DATE, 11);
				    newdate=miformatf.format(cal4.getTime());
				 System.out.println("el dia es:"+diax+""+"y la nueva fecha es:"+newdate);
			   }
	   			//----------------fin 27 de abril----------------------//
	   			
	   			//----------------------------28 de abril--------------------------//
	   			
	   			if( ((diax.equals("lun") && mifechaf1.equals(mifechaf2) && fecha2.compareTo(mifecha)>0 && diaaprobacion==diaabrilmayo && mesactual==mesAbril && abril28.equals(fechaaproformateada))) || (diax.equals("lun") && mifechaf1.equals(mifechaf2) && fecha2.compareTo(mifecha)>0 && diaaprobacion==diaabrilmayo && mesactual==mesMAyo && abril28.equals(fechaaproformateada)) ) {	
	   				Calendar cal4 = new GregorianCalendar();  
 					SimpleDateFormat miformatf = new SimpleDateFormat("yyyy-MM-dd");
 					cal4 = Calendar.getInstance(); 
 					cal4.setTime(mifecha);
				    cal4.add(Calendar.DATE, 10);
				    newdate=miformatf.format(cal4.getTime());
				 System.out.println("el dia es:"+diax+""+"y la nueva fecha es:"+newdate);
			   }
	   			if( ((diax.equals("mar") && mifechaf1.equals(mifechaf2) && fecha2.compareTo(mifecha)>0 && diaaprobacion==diaabrilmayo && mesactual==mesAbril && abril28.equals(fechaaproformateada))) || (diax.equals("mar") && mifechaf1.equals(mifechaf2) && fecha2.compareTo(mifecha)>0 && diaaprobacion==diaabrilmayo && mesactual==mesMAyo && abril28.equals(fechaaproformateada)) ) {
	   				Calendar cal4 = new GregorianCalendar();  
 					SimpleDateFormat miformatf = new SimpleDateFormat("yyyy-MM-dd");
 					cal4 = Calendar.getInstance(); 
 					cal4.setTime(mifecha);
				    cal4.add(Calendar.DATE, 10);
				    newdate=miformatf.format(cal4.getTime());
				 System.out.println("el dia es:"+diax+""+"y la nueva fecha es:"+newdate);
			   }
	   			if( ((diax.equals("mié") && mifechaf1.equals(mifechaf2) && fecha2.compareTo(mifecha)>0 && diaaprobacion==diaabrilmayo && mesactual==mesAbril && abril28.equals(fechaaproformateada))) || (diax.equals("mié") && mifechaf1.equals(mifechaf2) && fecha2.compareTo(mifecha)>0 && diaaprobacion==diaabrilmayo && mesactual==mesMAyo && abril28.equals(fechaaproformateada)) ) {
	   				Calendar cal4 = new GregorianCalendar();  
 					SimpleDateFormat miformatf = new SimpleDateFormat("yyyy-MM-dd");
 					cal4 = Calendar.getInstance(); 
 					cal4.setTime(mifecha);
				    cal4.add(Calendar.DATE, 10);
				    newdate=miformatf.format(cal4.getTime());
				 System.out.println("el dia es:"+diax+""+"y la nueva fecha es:"+newdate);
			   }
	   			if( ((diax.equals("jue") && mifechaf1.equals(mifechaf2) && fecha2.compareTo(mifecha)>0 && diaaprobacion==diaabrilmayo && mesactual==mesAbril && abril28.equals(fechaaproformateada))) || (diax.equals("jue") && mifechaf1.equals(mifechaf2) && fecha2.compareTo(mifecha)>0 && diaaprobacion==diaabrilmayo && mesactual==mesMAyo && abril28.equals(fechaaproformateada)) ) {
	   				Calendar cal4 = new GregorianCalendar();  
 					SimpleDateFormat miformatf = new SimpleDateFormat("yyyy-MM-dd");
 					cal4 = Calendar.getInstance(); 
 					cal4.setTime(mifecha);
				    cal4.add(Calendar.DATE, 9);
				    newdate=miformatf.format(cal4.getTime());
				 System.out.println("el dia es:"+diax+""+"y la nueva fecha es:"+newdate);
			   }
	   			if( ((diax.equals("vie") && mifechaf1.equals(mifechaf2) && fecha2.compareTo(mifecha)>0 && diaaprobacion==diaabrilmayo && mesactual==mesAbril && abril28.equals(fechaaproformateada))) || (diax.equals("vie") && mifechaf1.equals(mifechaf2) && fecha2.compareTo(mifecha)>0 && diaaprobacion==diaabrilmayo && mesactual==mesMAyo && abril28.equals(fechaaproformateada)) ) {
	   				Calendar cal4 = new GregorianCalendar();  
 					SimpleDateFormat miformatf = new SimpleDateFormat("yyyy-MM-dd");
 					cal4 = Calendar.getInstance(); 
 					cal4.setTime(mifecha);
				    cal4.add(Calendar.DATE, 11);
				    newdate=miformatf.format(cal4.getTime());
				 System.out.println("el dia es:"+diax+""+"y la nueva fecha es:"+newdate);
			   }
	   			if( ((diax.equals("sáb") && mifechaf1.equals(mifechaf2) && fecha2.compareTo(mifecha)>0 && diaaprobacion==diaabrilmayo && mesactual==mesAbril && abril28.equals(fechaaproformateada))) || (diax.equals("sáb") && mifechaf1.equals(mifechaf2) && fecha2.compareTo(mifecha)>0 && diaaprobacion==diaabrilmayo && mesactual==mesMAyo && abril28.equals(fechaaproformateada)) ) {
	   				Calendar cal4 = new GregorianCalendar();  
 					SimpleDateFormat miformatf = new SimpleDateFormat("yyyy-MM-dd");
 					cal4 = Calendar.getInstance(); 
 					cal4.setTime(mifecha);
				    cal4.add(Calendar.DATE, 11);
				    newdate=miformatf.format(cal4.getTime());
				 System.out.println("el dia es:"+diax+""+"y la nueva fecha es:"+newdate);
			   }
	   			//--------------------------fin 28 de abril----------------------//
	   			
	   			
	   			//---------------------------dia 29 de abril---------------------//
	   			if( ((diax.equals("lun") && mifechaf1.equals(mifechaf2) && fecha2.compareTo(mifecha)>0 && diaaprobacion==diaabrilmayo && mesactual==mesAbril && abril29.equals(fechaaproformateada))) || (diax.equals("lun") && mifechaf1.equals(mifechaf2) && fecha2.compareTo(mifecha)>0 && diaaprobacion==diaabrilmayo && mesactual==mesMAyo && abril29.equals(fechaaproformateada)) ) {	
	   				Calendar cal4 = new GregorianCalendar();  
 					SimpleDateFormat miformatf = new SimpleDateFormat("yyyy-MM-dd");
 					cal4 = Calendar.getInstance(); 
 					cal4.setTime(mifecha);
				    cal4.add(Calendar.DATE, 10);
				    newdate=miformatf.format(cal4.getTime());
				 System.out.println("el dia es:"+diax+""+"y la nueva fecha es:"+newdate);
			   }
	   			if( ((diax.equals("mar") && mifechaf1.equals(mifechaf2) && fecha2.compareTo(mifecha)>0 && diaaprobacion==diaabrilmayo && mesactual==mesAbril && abril29.equals(fechaaproformateada))) || (diax.equals("mar") && mifechaf1.equals(mifechaf2) && fecha2.compareTo(mifecha)>0 && diaaprobacion==diaabrilmayo && mesactual==mesMAyo && abril29.equals(fechaaproformateada)) ) {	
	   				Calendar cal4 = new GregorianCalendar();  
 					SimpleDateFormat miformatf = new SimpleDateFormat("yyyy-MM-dd");
 					cal4 = Calendar.getInstance(); 
 					cal4.setTime(mifecha);
				    cal4.add(Calendar.DATE, 10);
				    newdate=miformatf.format(cal4.getTime());
				 System.out.println("el dia es:"+diax+""+"y la nueva fecha es:"+newdate);
			   }
	   			if( ((diax.equals("mié") && mifechaf1.equals(mifechaf2) && fecha2.compareTo(mifecha)>0 && diaaprobacion==diaabrilmayo && mesactual==mesAbril && abril29.equals(fechaaproformateada))) || (diax.equals("mié") && mifechaf1.equals(mifechaf2) && fecha2.compareTo(mifecha)>0 && diaaprobacion==diaabrilmayo && mesactual==mesMAyo && abril29.equals(fechaaproformateada)) ) {	
	   				Calendar cal4 = new GregorianCalendar();  
 					SimpleDateFormat miformatf = new SimpleDateFormat("yyyy-MM-dd");
 					cal4 = Calendar.getInstance(); 
 					cal4.setTime(mifecha);
				    cal4.add(Calendar.DATE, 10);
				    newdate=miformatf.format(cal4.getTime());
				 System.out.println("el dia es:"+diax+""+"y la nueva fecha es:"+newdate);
			   }
	   			if( ((diax.equals("jue") && mifechaf1.equals(mifechaf2) && fecha2.compareTo(mifecha)>0 && diaaprobacion==diaabrilmayo && mesactual==mesAbril && abril29.equals(fechaaproformateada))) || (diax.equals("jue") && mifechaf1.equals(mifechaf2) && fecha2.compareTo(mifecha)>0 && diaaprobacion==diaabrilmayo && mesactual==mesMAyo && abril29.equals(fechaaproformateada)) ) {	
	   				Calendar cal4 = new GregorianCalendar();  
 					SimpleDateFormat miformatf = new SimpleDateFormat("yyyy-MM-dd");
 					cal4 = Calendar.getInstance(); 
 					cal4.setTime(mifecha);
				    cal4.add(Calendar.DATE, 11);
				    newdate=miformatf.format(cal4.getTime());
				 System.out.println("el dia es:"+diax+""+"y la nueva fecha es:"+newdate);
			   }
	   			if( ((diax.equals("vie") && mifechaf1.equals(mifechaf2) && fecha2.compareTo(mifecha)>0 && diaaprobacion==diaabrilmayo && mesactual==mesAbril && abril29.equals(fechaaproformateada))) || (diax.equals("vie") && mifechaf1.equals(mifechaf2) && fecha2.compareTo(mifecha)>0 && diaaprobacion==diaabrilmayo && mesactual==mesMAyo && abril29.equals(fechaaproformateada)) ) {	
	   				Calendar cal4 = new GregorianCalendar();  
 					SimpleDateFormat miformatf = new SimpleDateFormat("yyyy-MM-dd");
 					cal4 = Calendar.getInstance(); 
 					cal4.setTime(mifecha);
				    cal4.add(Calendar.DATE, 10);
				    newdate=miformatf.format(cal4.getTime());
				 System.out.println("el dia es:"+diax+""+"y la nueva fecha es:"+newdate);
			   }
	   			if( ((diax.equals("sáb") && mifechaf1.equals(mifechaf2) && fecha2.compareTo(mifecha)>0 && diaaprobacion==diaabrilmayo && mesactual==mesAbril && abril29.equals(fechaaproformateada))) || (diax.equals("sáb") && mifechaf1.equals(mifechaf2) && fecha2.compareTo(mifecha)>0 && diaaprobacion==diaabrilmayo && mesactual==mesMAyo && abril29.equals(fechaaproformateada)) ) {	
	   				Calendar cal4 = new GregorianCalendar();  
 					SimpleDateFormat miformatf = new SimpleDateFormat("yyyy-MM-dd");
 					cal4 = Calendar.getInstance(); 
 					cal4.setTime(mifecha);
				    cal4.add(Calendar.DATE, 11);
				    newdate=miformatf.format(cal4.getTime());
				 System.out.println("el dia es:"+diax+""+"y la nueva fecha es:"+newdate);
			   }
	   			
	   			//--------------------------fin 29 de abril----------------------//
	   			
	   			//------------------------------inicio 30 de abril---------------//
	   			if( ((diax.equals("lun") && mifechaf1.equals(mifechaf2) && fecha2.compareTo(mifecha)>0 && diaaprobacion==diaabrilmayo && mesactual==mesAbril && abril30.equals(fechaaproformateada))) || (diax.equals("lun") && mifechaf1.equals(mifechaf2) && fecha2.compareTo(mifecha)>0 && diaaprobacion==diaabrilmayo && mesactual==mesMAyo && abril30.equals(fechaaproformateada)) ) {	
	   				Calendar cal4 = new GregorianCalendar();  
 					SimpleDateFormat miformatf = new SimpleDateFormat("yyyy-MM-dd");
 					cal4 = Calendar.getInstance(); 
 					cal4.setTime(mifecha);
				    cal4.add(Calendar.DATE, 10);
				    newdate=miformatf.format(cal4.getTime());
				 System.out.println("el dia es:"+diax+""+"y la nueva fecha es:"+newdate);
			   }
	   			if( ((diax.equals("mar") && mifechaf1.equals(mifechaf2) && fecha2.compareTo(mifecha)>0 && diaaprobacion==diaabrilmayo && mesactual==mesAbril && abril30.equals(fechaaproformateada))) || (diax.equals("mar") && mifechaf1.equals(mifechaf2) && fecha2.compareTo(mifecha)>0 && diaaprobacion==diaabrilmayo && mesactual==mesMAyo && abril30.equals(fechaaproformateada)) ) {	
	   				Calendar cal4 = new GregorianCalendar();  
 					SimpleDateFormat miformatf = new SimpleDateFormat("yyyy-MM-dd");
 					cal4 = Calendar.getInstance(); 
 					cal4.setTime(mifecha);
				    cal4.add(Calendar.DATE, 10);
				    newdate=miformatf.format(cal4.getTime());
				 System.out.println("el dia es:"+diax+""+"y la nueva fecha es:"+newdate);
			   }
	   			if( ((diax.equals("mié") && mifechaf1.equals(mifechaf2) && fecha2.compareTo(mifecha)>0 && diaaprobacion==diaabrilmayo && mesactual==mesAbril && abril30.equals(fechaaproformateada))) || (diax.equals("mié") && mifechaf1.equals(mifechaf2) && fecha2.compareTo(mifecha)>0 && diaaprobacion==diaabrilmayo && mesactual==mesMAyo && abril30.equals(fechaaproformateada)) ) {	
	   				Calendar cal4 = new GregorianCalendar();  
 					SimpleDateFormat miformatf = new SimpleDateFormat("yyyy-MM-dd");
 					cal4 = Calendar.getInstance(); 
 					cal4.setTime(mifecha);
				    cal4.add(Calendar.DATE, 10);
				    newdate=miformatf.format(cal4.getTime());
				 System.out.println("el dia es:"+diax+""+"y la nueva fecha es:"+newdate);
			   }
	   			if( ((diax.equals("jue") && mifechaf1.equals(mifechaf2) && fecha2.compareTo(mifecha)>0 && diaaprobacion==diaabrilmayo && mesactual==mesAbril && abril30.equals(fechaaproformateada))) || (diax.equals("jue") && mifechaf1.equals(mifechaf2) && fecha2.compareTo(mifecha)>0 && diaaprobacion==diaabrilmayo && mesactual==mesMAyo && abril30.equals(fechaaproformateada)) ) {	
	   				Calendar cal4 = new GregorianCalendar();  
 					SimpleDateFormat miformatf = new SimpleDateFormat("yyyy-MM-dd");
 					cal4 = Calendar.getInstance(); 
 					cal4.setTime(mifecha);
				    cal4.add(Calendar.DATE, 11);
				    newdate=miformatf.format(cal4.getTime());
				 System.out.println("el dia es:"+diax+""+"y la nueva fecha es:"+newdate);
			   }
	   			if( ((diax.equals("vie") && mifechaf1.equals(mifechaf2) && fecha2.compareTo(mifecha)>0 && diaaprobacion==diaabrilmayo && mesactual==mesAbril && abril30.equals(fechaaproformateada))) || (diax.equals("vie") && mifechaf1.equals(mifechaf2) && fecha2.compareTo(mifecha)>0 && diaaprobacion==diaabrilmayo && mesactual==mesMAyo && abril30.equals(fechaaproformateada)) ) {	
	   				Calendar cal4 = new GregorianCalendar();  
 					SimpleDateFormat miformatf = new SimpleDateFormat("yyyy-MM-dd");
 					cal4 = Calendar.getInstance(); 
 					cal4.setTime(mifecha);
				    cal4.add(Calendar.DATE, 11);
				    newdate=miformatf.format(cal4.getTime());
				 System.out.println("el dia es:"+diax+""+"y la nueva fecha es:"+newdate);
			   }
	   			if( ((diax.equals("sáb") && mifechaf1.equals(mifechaf2) && fecha2.compareTo(mifecha)>0 && diaaprobacion==diaabrilmayo && mesactual==mesAbril && abril30.equals(fechaaproformateada))) || (diax.equals("sáb") && mifechaf1.equals(mifechaf2) && fecha2.compareTo(mifecha)>0 && diaaprobacion==diaabrilmayo && mesactual==mesMAyo && abril30.equals(fechaaproformateada)) ) {	
	   				Calendar cal4 = new GregorianCalendar();  
 					SimpleDateFormat miformatf = new SimpleDateFormat("yyyy-MM-dd");
 					cal4 = Calendar.getInstance(); 
 					cal4.setTime(mifecha);
				    cal4.add(Calendar.DATE, 10);
				    newdate=miformatf.format(cal4.getTime());
				 System.out.println("el dia es:"+diax+""+"y la nueva fecha es:"+newdate);
			   }
	   			//-----------------------------fin 30 de abril-------------------//
	   			
	   			//--------------------dias normales antes de los dias que se cruzan con el 25 de mayo------------------------------------//
	   		 if(diax.equals("lun")&& diaaprobacion==diamayo) {
				    SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
					 nuevocalendario.add(Calendar.DATE, 9);
					  newdate=formateofecha.format(nuevocalendario.getTime());
					 System.out.println("el dia es:"+diax+""+"y la nueva fecha es:"+newdate);
				   }
	   			
	   		 if(diax.equals("mar")&& diaaprobacion==diamayo) {
				    SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
					 nuevocalendario.add(Calendar.DATE, 9);
					  newdate=formateofecha.format(nuevocalendario.getTime());
					 System.out.println("el dia es:"+diax+""+"y la nueva fecha es:"+newdate);
				   }
	   		 if(diax.equals("mié")&& diaaprobacion==diamayo) {
				    SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
					 nuevocalendario.add(Calendar.DATE, 9);
					  newdate=formateofecha.format(nuevocalendario.getTime());
					 System.out.println("el dia es:"+diax+""+"y la nueva fecha es:"+newdate);
				   }
	   		 if(diax.equals("jue")&& diaaprobacion==diamayo) {
				    SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
					 nuevocalendario.add(Calendar.DATE, 10);
					  newdate=formateofecha.format(nuevocalendario.getTime());
					 System.out.println("el dia es:"+diax+""+"y la nueva fecha es:"+newdate);
				   }
	   		 if(diax.equals("vie")&& diaaprobacion==diamayo) {
				    SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
					 nuevocalendario.add(Calendar.DATE, 10);
					  newdate=formateofecha.format(nuevocalendario.getTime());
					 System.out.println("el dia es:"+diax+""+"y la nueva fecha es:"+newdate);
				   }
	
	   		 if(diax.equals("sáb")&& diaaprobacion==diamayo) {
				    SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
					 nuevocalendario.add(Calendar.DATE, 10);
					  newdate=formateofecha.format(nuevocalendario.getTime());
					 System.out.println("el dia es:"+diax+""+"y la nueva fecha es:"+newdate);
				   }
	   	//--------------------fin dias normales antes de los dias que se cruzan con el 25 de mayo------------------------------------//	
	   		//--------------------mayo dias cruzados con el festivo 23 de mayo---------------------// 
	   		if(diax.equals("lun") && diaaprobacion+10==diamayofes ) {
			    SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
				 nuevocalendario.add(Calendar.DATE, 9);
				  newdate=formateofecha.format(nuevocalendario.getTime());
				 System.out.println("el dia es:"+diax+""+"y la nueva fecha es:"+newdate);
			}
	   		if(diax.equals("mar") && diaaprobacion+10==diamayofes ) {
			    SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
				 nuevocalendario.add(Calendar.DATE, 9);
				  newdate=formateofecha.format(nuevocalendario.getTime());
				 System.out.println("el dia es:"+diax+""+"y la nueva fecha es:"+newdate);
			}
	   		 
	   		if(diax.equals("mié") && diaaprobacion+10==diamayofes ) {
			    SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
				 nuevocalendario.add(Calendar.DATE, 9);
				  newdate=formateofecha.format(nuevocalendario.getTime());
				 System.out.println("el dia es:"+diax+""+"y la nueva fecha es:"+newdate);
			}
	   		 
	   		 
	   		 if(diax.equals("jue") && diaaprobacion+10==diamayofes ) {
				    SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
					 nuevocalendario.add(Calendar.DATE, 9);
					  newdate=formateofecha.format(nuevocalendario.getTime());
					 System.out.println("el dia es:"+diax+""+"y la nueva fecha es:"+newdate);
				}
	   		 
	   		 if(diax.equals("vie") && diaaprobacion+10==diamayofes ) {
				    SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
					 nuevocalendario.add(Calendar.DATE, 11);
					  newdate=formateofecha.format(nuevocalendario.getTime());
					 System.out.println("el dia es:"+diax+""+"y la nueva fecha es:"+newdate);
				}
	 		 if(diax.equals("sáb") && diaaprobacion+10==diamayofes ) {
				    SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
					 nuevocalendario.add(Calendar.DATE, 11);
					  newdate=formateofecha.format(nuevocalendario.getTime());
					 System.out.println("el dia es:"+diax+""+"y la nueva fecha es:"+newdate);
				}
	 		 
	 		if(diax.equals("lun") && diaaprobacion+9==diamayofes ) {
			    SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
				 nuevocalendario.add(Calendar.DATE, 10);
				  newdate=formateofecha.format(nuevocalendario.getTime());
				 System.out.println("el dia es:"+diax+""+"y la nueva fecha es:"+newdate);
			}
	 		if(diax.equals("mar") && diaaprobacion+9==diamayofes ) {
			    SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
				 nuevocalendario.add(Calendar.DATE, 10);
				  newdate=formateofecha.format(nuevocalendario.getTime());
				 System.out.println("el dia es:"+diax+""+"y la nueva fecha es:"+newdate);
			}
	 		if(diax.equals("mié") && diaaprobacion+9==diamayofes ) {
			    SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
				 nuevocalendario.add(Calendar.DATE, 10);
				  newdate=formateofecha.format(nuevocalendario.getTime());
				 System.out.println("el dia es:"+diax+""+"y la nueva fecha es:"+newdate);
			}
	 		if(diax.equals("jue") && diaaprobacion+9==diamayofes ) {
			    SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
				 nuevocalendario.add(Calendar.DATE, 11);
				  newdate=formateofecha.format(nuevocalendario.getTime());
				 System.out.println("el dia es:"+diax+""+"y la nueva fecha es:"+newdate);
			}
	 		if(diax.equals("vie") && diaaprobacion+9==diamayofes ) {
			    SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
				 nuevocalendario.add(Calendar.DATE, 10);
				  newdate=formateofecha.format(nuevocalendario.getTime());
				 System.out.println("el dia es:"+diax+""+"y la nueva fecha es:"+newdate);
			}
	 		if(diax.equals("sáb") && diaaprobacion+9==diamayofes ) {
			    SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
				 nuevocalendario.add(Calendar.DATE, 11);
				  newdate=formateofecha.format(nuevocalendario.getTime());
				 System.out.println("el dia es:"+diax+""+"y la nueva fecha es:"+newdate);
			}
	 		if(diax.equals("lun") && diaaprobacion+8==diamayofes ) {
			    SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
				 nuevocalendario.add(Calendar.DATE, 10);
				  newdate=formateofecha.format(nuevocalendario.getTime());
				 System.out.println("el dia es:"+diax+""+"y la nueva fecha es:"+newdate);
			}
	 		if(diax.equals("mar") && diaaprobacion+8==diamayofes ) {
			    SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
				 nuevocalendario.add(Calendar.DATE, 10);
				  newdate=formateofecha.format(nuevocalendario.getTime());
				 System.out.println("el dia es:"+diax+""+"y la nueva fecha es:"+newdate);
			}
	 		if(diax.equals("mié") && diaaprobacion+8==diamayofes ) {
			    SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
				 nuevocalendario.add(Calendar.DATE, 10);
				  newdate=formateofecha.format(nuevocalendario.getTime());
				 System.out.println("el dia es:"+diax+""+"y la nueva fecha es:"+newdate);
			}
	 		if(diax.equals("jue") && diaaprobacion+8==diamayofes ) {
			    SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
				 nuevocalendario.add(Calendar.DATE, 11);
				  newdate=formateofecha.format(nuevocalendario.getTime());
				 System.out.println("el dia es:"+diax+""+"y la nueva fecha es:"+newdate);
			}
	 		if(diax.equals("vie") && diaaprobacion+8==diamayofes ) {
			    SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
				 nuevocalendario.add(Calendar.DATE, 11);
				  newdate=formateofecha.format(nuevocalendario.getTime());
				 System.out.println("el dia es:"+diax+""+"y la nueva fecha es:"+newdate);
			}
	 		if(diax.equals("sáb") && diaaprobacion+8==diamayofes ) {
			    SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
				 nuevocalendario.add(Calendar.DATE, 10);
				  newdate=formateofecha.format(nuevocalendario.getTime());
				 System.out.println("el dia es:"+diax+""+"y la nueva fecha es:"+newdate);
			}
	 		
	 		if(diax.equals("lun") && diaaprobacion+7==diamayofes ) {
			    SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
				 nuevocalendario.add(Calendar.DATE, 10);
				  newdate=formateofecha.format(nuevocalendario.getTime());
				 System.out.println("el dia es:"+diax+""+"y la nueva fecha es:"+newdate);
			}
	 		if(diax.equals("mar") && diaaprobacion+7==diamayofes ) {
			    SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
				 nuevocalendario.add(Calendar.DATE, 10);
				  newdate=formateofecha.format(nuevocalendario.getTime());
				 System.out.println("el dia es:"+diax+""+"y la nueva fecha es:"+newdate);
			}
	 		if(diax.equals("mié") && diaaprobacion+7==diamayofes ) {
			    SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
				 nuevocalendario.add(Calendar.DATE, 10);
				  newdate=formateofecha.format(nuevocalendario.getTime());
				 System.out.println("el dia es:"+diax+""+"y la nueva fecha es:"+newdate);
			}
	 		if(diax.equals("jue") && diaaprobacion+7==diamayofes ) {
			    SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
				 nuevocalendario.add(Calendar.DATE, 11);
				  newdate=formateofecha.format(nuevocalendario.getTime());
				 System.out.println("el dia es:"+diax+""+"y la nueva fecha es:"+newdate);
			}
	 		if(diax.equals("vie") && diaaprobacion+7==diamayofes ) {
			    SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
				 nuevocalendario.add(Calendar.DATE, 11);
				  newdate=formateofecha.format(nuevocalendario.getTime());
				 System.out.println("el dia es:"+diax+""+"y la nueva fecha es:"+newdate);
			}
	 		if(diax.equals("sáb") && diaaprobacion+7==diamayofes ) {
			    SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
				 nuevocalendario.add(Calendar.DATE, 11);
				  newdate=formateofecha.format(nuevocalendario.getTime());
				 System.out.println("el dia es:"+diax+""+"y la nueva fecha es:"+newdate);
			}
	 		
	 		if(diax.equals("lun") && diaaprobacion+6==diamayofes ) {
			    SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
				 nuevocalendario.add(Calendar.DATE, 9);
				  newdate=formateofecha.format(nuevocalendario.getTime());
				 System.out.println("el dia es:"+diax+""+"y la nueva fecha es:"+newdate);
			}
	 		if(diax.equals("mar") && diaaprobacion+6==diamayofes ) {
			    SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
				 nuevocalendario.add(Calendar.DATE, 10);
				  newdate=formateofecha.format(nuevocalendario.getTime());
				 System.out.println("el dia es:"+diax+""+"y la nueva fecha es:"+newdate);
			}
	 		if(diax.equals("mié") && diaaprobacion+6==diamayofes ) {
			    SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
				 nuevocalendario.add(Calendar.DATE, 10);
				  newdate=formateofecha.format(nuevocalendario.getTime());
				 System.out.println("el dia es:"+diax+""+"y la nueva fecha es:"+newdate);
			}
	 		if(diax.equals("jue") && diaaprobacion+6==diamayofes ) {
			    SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
				 nuevocalendario.add(Calendar.DATE, 11);
				  newdate=formateofecha.format(nuevocalendario.getTime());
				 System.out.println("el dia es:"+diax+""+"y la nueva fecha es:"+newdate);
			}
	 		if(diax.equals("vie") && diaaprobacion+6==diamayofes ) {
			    SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
				 nuevocalendario.add(Calendar.DATE, 11);
				  newdate=formateofecha.format(nuevocalendario.getTime());
				 System.out.println("el dia es:"+diax+""+"y la nueva fecha es:"+newdate);
			}
	 		
	 		if(diax.equals("sáb") && diaaprobacion+6==diamayofes ) {
			    SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
				 nuevocalendario.add(Calendar.DATE, 10);
				  newdate=formateofecha.format(nuevocalendario.getTime());
				 System.out.println("el dia es:"+diax+""+"y la nueva fecha es:"+newdate);
			}
	 		if(diax.equals("lun") && diaaprobacion+5==diamayofes ) {
			    SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
				 nuevocalendario.add(Calendar.DATE, 10);
				  newdate=formateofecha.format(nuevocalendario.getTime());
				 System.out.println("el dia es:"+diax+""+"y la nueva fecha es:"+newdate);
			}
	 		if(diax.equals("mar") && diaaprobacion+5==diamayofes ) {
			    SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
				 nuevocalendario.add(Calendar.DATE, 9);
				  newdate=formateofecha.format(nuevocalendario.getTime());
				 System.out.println("el dia es:"+diax+""+"y la nueva fecha es:"+newdate);
			}
	 		if(diax.equals("mié") && diaaprobacion+5==diamayofes ) {
			    SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
				 nuevocalendario.add(Calendar.DATE, 10);
				  newdate=formateofecha.format(nuevocalendario.getTime());
				 System.out.println("el dia es:"+diax+""+"y la nueva fecha es:"+newdate);
			}
	 		if(diax.equals("jue") && diaaprobacion+5==diamayofes ) {
			    SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
				 nuevocalendario.add(Calendar.DATE, 11);
				  newdate=formateofecha.format(nuevocalendario.getTime());
				 System.out.println("el dia es:"+diax+""+"y la nueva fecha es:"+newdate);
			}
	 		if(diax.equals("vie") && diaaprobacion+5==diamayofes ) {
			    SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
				 nuevocalendario.add(Calendar.DATE, 11);
				  newdate=formateofecha.format(nuevocalendario.getTime());
				 System.out.println("el dia es:"+diax+""+"y la nueva fecha es:"+newdate);
			}
	 		if(diax.equals("sáb") && diaaprobacion+5==diamayofes ) {
			    SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
				 nuevocalendario.add(Calendar.DATE, 11);
				  newdate=formateofecha.format(nuevocalendario.getTime());
				 System.out.println("el dia es:"+diax+""+"y la nueva fecha es:"+newdate);
			}
	 		if(diax.equals("lun") && diaaprobacion+4==diamayofes ) {
			    SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
				 nuevocalendario.add(Calendar.DATE, 10);
				  newdate=formateofecha.format(nuevocalendario.getTime());
				 System.out.println("el dia es:"+diax+""+"y la nueva fecha es:"+newdate);
			}
	 		if(diax.equals("mar") && diaaprobacion+4==diamayofes ) {
			    SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
				 nuevocalendario.add(Calendar.DATE, 10);
				  newdate=formateofecha.format(nuevocalendario.getTime());
				 System.out.println("el dia es:"+diax+""+"y la nueva fecha es:"+newdate);
			}
	 		if(diax.equals("mié") && diaaprobacion+4==diamayofes ) {
			    SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
				 nuevocalendario.add(Calendar.DATE, 9);
				  newdate=formateofecha.format(nuevocalendario.getTime());
				 System.out.println("el dia es:"+diax+""+"y la nueva fecha es:"+newdate);
			}
	 		if(diax.equals("jue") && diaaprobacion+4==diamayofes ) {
			    SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
				 nuevocalendario.add(Calendar.DATE, 11);
				  newdate=formateofecha.format(nuevocalendario.getTime());
				 System.out.println("el dia es:"+diax+""+"y la nueva fecha es:"+newdate);
			}
	 		if(diax.equals("vie") && diaaprobacion+4==diamayofes ) {
			    SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
				 nuevocalendario.add(Calendar.DATE, 11);
				  newdate=formateofecha.format(nuevocalendario.getTime());
				 System.out.println("el dia es:"+diax+""+"y la nueva fecha es:"+newdate);
			}
	 		if(diax.equals("sáb") && diaaprobacion+4==diamayofes ) {
			    SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
				 nuevocalendario.add(Calendar.DATE, 11);
				  newdate=formateofecha.format(nuevocalendario.getTime());
				 System.out.println("el dia es:"+diax+""+"y la nueva fecha es:"+newdate);
			}
	 		if(diax.equals("lun") && diaaprobacion+3==diamayofes ) {
			    SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
				 nuevocalendario.add(Calendar.DATE, 10);
				  newdate=formateofecha.format(nuevocalendario.getTime());
				 System.out.println("el dia es:"+diax+""+"y la nueva fecha es:"+newdate);
			}
	 		if(diax.equals("mar") && diaaprobacion+3==diamayofes ) {
			    SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
				 nuevocalendario.add(Calendar.DATE, 10);
				  newdate=formateofecha.format(nuevocalendario.getTime());
				 System.out.println("el dia es:"+diax+""+"y la nueva fecha es:"+newdate);
			}
	 		if(diax.equals("mié") && diaaprobacion+3==diamayofes ) {
			    SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
				 nuevocalendario.add(Calendar.DATE, 10);
				  newdate=formateofecha.format(nuevocalendario.getTime());
				 System.out.println("el dia es:"+diax+""+"y la nueva fecha es:"+newdate);
			}
	 		if(diax.equals("jue") && diaaprobacion+3==diamayofes ) {
			    SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
				 nuevocalendario.add(Calendar.DATE, 9);
				  newdate=formateofecha.format(nuevocalendario.getTime());
				 System.out.println("el dia es:"+diax+""+"y la nueva fecha es:"+newdate);
			}
	 		if(diax.equals("vie") && diaaprobacion+3==diamayofes ) {
			    SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
				 nuevocalendario.add(Calendar.DATE, 11);
				  newdate=formateofecha.format(nuevocalendario.getTime());
				 System.out.println("el dia es:"+diax+""+"y la nueva fecha es:"+newdate);
			}
	 		if(diax.equals("sáb") && diaaprobacion+3==diamayofes ) {
			    SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
				 nuevocalendario.add(Calendar.DATE, 11);
				  newdate=formateofecha.format(nuevocalendario.getTime());
				 System.out.println("el dia es:"+diax+""+"y la nueva fecha es:"+newdate);
			}
	 		if(diax.equals("lun") && diaaprobacion+2==diamayofes ) {
			    SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
				 nuevocalendario.add(Calendar.DATE, 10);
				  newdate=formateofecha.format(nuevocalendario.getTime());
				 System.out.println("el dia es:"+diax+""+"y la nueva fecha es:"+newdate);
			}
	 		if(diax.equals("mar") && diaaprobacion+2==diamayofes ) {
			    SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
				 nuevocalendario.add(Calendar.DATE, 10);
				  newdate=formateofecha.format(nuevocalendario.getTime());
				 System.out.println("el dia es:"+diax+""+"y la nueva fecha es:"+newdate);
			}
	 		if(diax.equals("mié") && diaaprobacion+2==diamayofes ) {
			    SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
				 nuevocalendario.add(Calendar.DATE, 10);
				  newdate=formateofecha.format(nuevocalendario.getTime());
				 System.out.println("el dia es:"+diax+""+"y la nueva fecha es:"+newdate);
			}
	 		if(diax.equals("mié") && diaaprobacion+2==diamayofes ) {
			    SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
				 nuevocalendario.add(Calendar.DATE, 10);
				  newdate=formateofecha.format(nuevocalendario.getTime());
				 System.out.println("el dia es:"+diax+""+"y la nueva fecha es:"+newdate);
			}
	 		if(diax.equals("jue") && diaaprobacion+2==diamayofes ) {
			    SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
				 nuevocalendario.add(Calendar.DATE, 11);
				  newdate=formateofecha.format(nuevocalendario.getTime());
				 System.out.println("el dia es:"+diax+""+"y la nueva fecha es:"+newdate);
			}
	 		if(diax.equals("vie") && diaaprobacion+2==diamayofes ) {
			    SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
				 nuevocalendario.add(Calendar.DATE, 10);
				  newdate=formateofecha.format(nuevocalendario.getTime());
				 System.out.println("el dia es:"+diax+""+"y la nueva fecha es:"+newdate);
			}
	 		if(diax.equals("sáb") && diaaprobacion+2==diamayofes ) {
			    SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
				 nuevocalendario.add(Calendar.DATE, 11);
				  newdate=formateofecha.format(nuevocalendario.getTime());
				 System.out.println("el dia es:"+diax+""+"y la nueva fecha es:"+newdate);
			}
	 		if(diax.equals("lun") && diaaprobacion+1==diamayofes ) {
			    SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
				 nuevocalendario.add(Calendar.DATE, 10);
				  newdate=formateofecha.format(nuevocalendario.getTime());
				 System.out.println("el dia es:"+diax+""+"y la nueva fecha es:"+newdate);
			}
	 		if(diax.equals("mar") && diaaprobacion+1==diamayofes ) {
			    SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
				 nuevocalendario.add(Calendar.DATE, 10);
				  newdate=formateofecha.format(nuevocalendario.getTime());
				 System.out.println("el dia es:"+diax+""+"y la nueva fecha es:"+newdate);
			}
	 		if(diax.equals("mié") && diaaprobacion+1==diamayofes ) {
			    SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
				 nuevocalendario.add(Calendar.DATE, 10);
				  newdate=formateofecha.format(nuevocalendario.getTime());
				 System.out.println("el dia es:"+diax+""+"y la nueva fecha es:"+newdate);
			}
	 		if(diax.equals("jue") && diaaprobacion+1==diamayofes ) {
			    SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
				 nuevocalendario.add(Calendar.DATE, 11);
				  newdate=formateofecha.format(nuevocalendario.getTime());
				 System.out.println("el dia es:"+diax+""+"y la nueva fecha es:"+newdate);
			}
	 		if(diax.equals("vie") && diaaprobacion+1==diamayofes ) {
			    SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
				 nuevocalendario.add(Calendar.DATE, 11);
				  newdate=formateofecha.format(nuevocalendario.getTime());
				 System.out.println("el dia es:"+diax+""+"y la nueva fecha es:"+newdate);
			}
	 		if(diax.equals("sáb") && diaaprobacion+1==diamayofes ) {
			    SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
				 nuevocalendario.add(Calendar.DATE, 10);
				  newdate=formateofecha.format(nuevocalendario.getTime());
				 System.out.println("el dia es:"+diax+""+"y la nueva fecha es:"+newdate);
			}
	 		
	 		//-------------------------fin dias cruzados con festivo 23 de mayo------------//
	 		
	 		
	 		//--------------------dias normales despues del 23 de mayo y antes del 28 de mayo------//
	 		if(diax.equals("lun") && diaaprobacion==diamayonor ) {
			    SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
				 nuevocalendario.add(Calendar.DATE, 9);
				  newdate=formateofecha.format(nuevocalendario.getTime());
				 System.out.println("el dia es:"+diax+""+"y la nueva fecha es:"+newdate);
			}
	 		if(diax.equals("mar") && diaaprobacion==diamayonor ) {
			    SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
				 nuevocalendario.add(Calendar.DATE, 9);
				  newdate=formateofecha.format(nuevocalendario.getTime());
				 System.out.println("el dia es:"+diax+""+"y la nueva fecha es:"+newdate);
			}
	 		if(diax.equals("mié") && diaaprobacion==diamayonor ) {
			    SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
				 nuevocalendario.add(Calendar.DATE, 9);
				  newdate=formateofecha.format(nuevocalendario.getTime());
				 System.out.println("el dia es:"+diax+""+"y la nueva fecha es:"+newdate);
			}
	 		if(diax.equals("jue") && diaaprobacion==diamayonor ) {
			    SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
				 nuevocalendario.add(Calendar.DATE, 9);
				  newdate=formateofecha.format(nuevocalendario.getTime());
				 System.out.println("el dia es:"+diax+""+"y la nueva fecha es:"+newdate);
			}
	 		if(diax.equals("vie") && diaaprobacion==diamayonor ) {
			    SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
				 nuevocalendario.add(Calendar.DATE, 10);
				  newdate=formateofecha.format(nuevocalendario.getTime());
				 System.out.println("el dia es:"+diax+""+"y la nueva fecha es:"+newdate);
			}
	 		if(diax.equals("sáb") && diaaprobacion==diamayonor ) {
			    SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
				 nuevocalendario.add(Calendar.DATE, 10);
				  newdate=formateofecha.format(nuevocalendario.getTime());
				 System.out.println("el dia es:"+diax+""+"y la nueva fecha es:"+newdate);
			}
	 		//--------------------fin dias normales despues del 23 de mayo y antes del 28 de mayo------//
	 		//-------------------------inicio 31 de mayo-------------------------//
			if(diax.equals("lun") && diaaprobacion==diaprobacion  && mesfinalaprobacion==mesMAyo && mesactual==mesMAyo ) {
			    SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
				 nuevocalendario.add(Calendar.DATE, 9);
				  newdate=formateofecha.format(nuevocalendario.getTime());
				 System.out.println("el dia es:"+diax+""+"y la nueva fecha es:"+newdate);
			}
			if(diax.equals("mar") && diaaprobacion==diaprobacion  && mesfinalaprobacion==mesMAyo && mesactual==mesMAyo ) {
			    SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
				 nuevocalendario.add(Calendar.DATE, 9);
				  newdate=formateofecha.format(nuevocalendario.getTime());
				 System.out.println("el dia es:"+diax+""+"y la nueva fecha es:"+newdate);
			}
			if(diax.equals("mié") && diaaprobacion==diaprobacion  && mesfinalaprobacion==mesMAyo && mesactual==mesMAyo ) {
			    SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
				 nuevocalendario.add(Calendar.DATE, 9);
				  newdate=formateofecha.format(nuevocalendario.getTime());
				 System.out.println("el dia es:"+diax+""+"y la nueva fecha es:"+newdate);
			}
			if(diax.equals("jue") && diaaprobacion==diaprobacion  && mesfinalaprobacion==mesMAyo && mesactual==mesMAyo ) {
			    SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
				 nuevocalendario.add(Calendar.DATE, 9);
				  newdate=formateofecha.format(nuevocalendario.getTime());
				 System.out.println("el dia es:"+diax+""+"y la nueva fecha es:"+newdate);
			}
			if(diax.equals("vie") && diaaprobacion==diaprobacion && mesfinalaprobacion==mesMAyo && mesactual==mesMAyo ) {
			    SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
				 nuevocalendario.add(Calendar.DATE, 10);
				  newdate=formateofecha.format(nuevocalendario.getTime());
				 System.out.println("el dia es:"+diax+""+"y la nueva fecha es :"+newdate);
			}
			if(diax.equals("sáb") && diaaprobacion==diaprobacion   && mesfinalaprobacion==mesMAyo && mesactual==mesMAyo) {
			    SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
				 nuevocalendario.add(Calendar.DATE, 10);
				  newdate=formateofecha.format(nuevocalendario.getTime());
				 System.out.println("el dia es:"+diax+""+"y la nueva fecha es:"+newdate);
			}
	 		//--------------------fin 31 de mayo-------//
	 		
           //-----------junio dias normales antes del cruze de los dias con el festivo 15 de junio-----//
			
			 if(diax.equals("lun")&& diaaprobacion==diajunion) {
				    SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
					 nuevocalendario.add(Calendar.DATE, 9);
					  newdate=formateofecha.format(nuevocalendario.getTime());
					 System.out.println("el dia es:"+diax+""+"y la nueva fecha es:"+newdate);
				   }
			 if(diax.equals("mar")&& diaaprobacion==diajunion) {
				    SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
					 nuevocalendario.add(Calendar.DATE, 9);
					  newdate=formateofecha.format(nuevocalendario.getTime());
					 System.out.println("el dia es:"+diax+""+"y la nueva fecha es:"+newdate);
				   }
	   				
			 if(diax.equals("mié")&& diaaprobacion==diajunion) {
				    SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
					 nuevocalendario.add(Calendar.DATE, 9);
					  newdate=formateofecha.format(nuevocalendario.getTime());
					 System.out.println("el dia es:"+diax+""+"y la nueva fecha es:"+newdate);
				   }
	   				
			 if(diax.equals("jue")&& diaaprobacion==diajunion) {
				    SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
					 nuevocalendario.add(Calendar.DATE, 9);
					  newdate=formateofecha.format(nuevocalendario.getTime());
					 System.out.println("el dia es:"+diax+""+"y la nueva fecha es:"+newdate);
				   }
	   				
			 if(diax.equals("vie")&& diaaprobacion==diajunion) {
				    SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
					 nuevocalendario.add(Calendar.DATE, 10);
					  newdate=formateofecha.format(nuevocalendario.getTime());
					 System.out.println("el dia es:"+diax+""+"y la nueva fecha es:"+newdate);
				   }
	   				
			 if(diax.equals("sáb")&& diaaprobacion==diajunion) {
				    SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
					 nuevocalendario.add(Calendar.DATE, 10);
					  newdate=formateofecha.format(nuevocalendario.getTime());
					 System.out.println("el dia es:"+diax+""+"y la nueva fecha es:"+newdate);
				   }
	   				
	   			
			 //------------------dias que se cruzan con el festivo 15 de junio----------//
			   if(diax.equals("lun")&& diaaprobacion+10==diajuniof01 ) {
					    SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
  					 nuevocalendario.add(Calendar.DATE, 9);
  					  newdate=formateofecha.format(nuevocalendario.getTime());
  					 System.out.println("el dia es:"+diax+""+"y la nueva fecha es:"+newdate);
					}
			   if(diax.equals("mar")&& diaaprobacion+10==diajuniof01 ) {
				    SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
					 nuevocalendario.add(Calendar.DATE, 9);
					  newdate=formateofecha.format(nuevocalendario.getTime());
					 System.out.println("el dia es:"+diax+""+"y la nueva fecha es:"+newdate);
				}  
			   if(diax.equals("mié")&& diaaprobacion+10==diajuniof01 ) {
				    SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
					 nuevocalendario.add(Calendar.DATE, 9);
					  newdate=formateofecha.format(nuevocalendario.getTime());
					 System.out.println("el dia es:"+diax+""+"y la nueva fecha es:"+newdate);
				}  
			   
			   if(diax.equals("jue")&& diaaprobacion+10==diajuniof01 ) {
				    SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
					 nuevocalendario.add(Calendar.DATE, 9);
					  newdate=formateofecha.format(nuevocalendario.getTime());
					 System.out.println("el dia es:"+diax+""+"y la nueva fecha es:"+newdate);
				}  
			   
			   if(diax.equals("vie")&& diaaprobacion+10==diajuniof01 ) {
				    SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
					 nuevocalendario.add(Calendar.DATE, 11);
					  newdate=formateofecha.format(nuevocalendario.getTime());
					 System.out.println("el dia es:"+diax+""+"y la nueva fecha es:"+newdate); 
				}
			   if(diax.equals("sáb")&& diaaprobacion+10==diajuniof01 ) {
				    SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
					 nuevocalendario.add(Calendar.DATE, 11);
					  newdate=formateofecha.format(nuevocalendario.getTime());
					 System.out.println("el dia es:"+diax+""+"y la nueva fecha es:"+newdate); 
				}
			   
			   if(diax.equals("lun")&& diaaprobacion+9==diajuniof01 ) {
				    SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
					 nuevocalendario.add(Calendar.DATE, 10);
					  newdate=formateofecha.format(nuevocalendario.getTime());
					 System.out.println("el dia es:"+diax+""+"y la nueva fecha es:"+newdate);
				}
			   
			   if(diax.equals("mar")&& diaaprobacion+9==diajuniof01 ) {
				    SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
					 nuevocalendario.add(Calendar.DATE, 10);
					  newdate=formateofecha.format(nuevocalendario.getTime());
					 System.out.println("el dia es:"+diax+""+"y la nueva fecha es:"+newdate);
				}
			   if(diax.equals("mié")&& diaaprobacion+9==diajuniof01 ) {
				    SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
					 nuevocalendario.add(Calendar.DATE, 10);
					  newdate=formateofecha.format(nuevocalendario.getTime());
					 System.out.println("el dia es:"+diax+""+"y la nueva fecha es:"+newdate);
				}
			   if(diax.equals("jue")&& diaaprobacion+9==diajuniof01 ) {
				    SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
					 nuevocalendario.add(Calendar.DATE, 11);
					  newdate=formateofecha.format(nuevocalendario.getTime());
					 System.out.println("el dia es:"+diax+""+"y la nueva fecha es:"+newdate);
				}
			   if(diax.equals("vie")&& diaaprobacion+9==diajuniof01 ) {
				    SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
					 nuevocalendario.add(Calendar.DATE, 10);
					  newdate=formateofecha.format(nuevocalendario.getTime());
					 System.out.println("el dia es:"+diax+""+"y la nueva fecha es:"+newdate);
				}
			   if(diax.equals("sáb")&& diaaprobacion+9==diajuniof01 ) {
				    SimpleDateFormat formateofecha = new SimpleDateFormat("yyyy-MM-dd");
					 nuevocalendario.add(Calendar.DATE, 11);
					  newdate=formateofecha.format(nuevocalendario.getTime());
					 System.out.println("el dia es:"+diax+""+"y la nueva fecha es:"+newdate);
				}
			   
			 //------------------fin dias que se cruzan con el primer festivo----------//

	}

	
	
	public static void main(String[] args) throws ParseException {
		fecha datos = new fecha();
		datos.generafechaauto();
		
	}
}
