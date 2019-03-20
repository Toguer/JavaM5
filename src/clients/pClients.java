package clients;

import java.util.Arrays;
import java.util.Scanner;

public class pClients {
	Scanner lector=new Scanner(System.in);
	static final int numClients=100;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//hola
		double numMenu = 0;
		String[] arrayClients=new String[numClients];
		pClients programa = new pClients();
		
		
		boolean sortir=false;
		while (!sortir) {
			numMenu=programa.menu(numMenu);	
		
		switch (numMenu) {
		case 1: 
			programa.AltaClient(arrayClients);
			break;
		case 2: 
			programa.visualitzacio(arrayClients);
			break;
		case 3: 
			programa.Baixa(arrayClients);
			break;
		case 4:
			programa.Recuperacio(arrayClients);
			break;
		case 5:
			programa.Ordenacio(arrayClients);			
			break;
		case 6:
			programa.recerca(arrayClients);
			break;
		case 7:
			System.out.println("Fi del programa");
			sortir=true;
			break;
		}
	}
	}
	public int menu(int numMenu) {
		
		System.out.println("1. Alta d'un client");
		System.out.println("2. VisualitzaciÃ³ client");
		System.out.println("3. Baixa client");
		System.out.println("4. RecuperaciÃ³ de dades de client");
		System.out.println("5. Ordena els clients");
		System.out.println("6. Recerca de clients");
		System.out.println("7. Sortir");
		numMenu=lector.nextInt();
		return numMenu;
	}
	public void AltaClient(String[] arrayClients) {
		
		System.out.println("Inserta el teu nom");
		boolean Valid=false;
		String aux;
		int i=0;
		while (Valid==false) {
			if (arrayClients[i]==null) {
				Valid=true;
			}else {
				i++;
			}
		}arrayClients[i]="NoEsborrat".concat(";".concat(lector.next().concat(";")));
		System.out.println("Inserta el teu cognom");
		arrayClients[i]=arrayClients[i].concat(lector.next().concat(";"));
		System.out.println("Inserta el teu nif");
		arrayClients[i]=arrayClients[i].concat(lector.next().concat(";"));
		System.out.println("Inserta el teu telÃšfon");
		arrayClients[i]=arrayClients[i].concat(lector.next().concat(";")) ;
		aux=Integer.toString(i);
		arrayClients[i]=arrayClients[i].concat(aux);
		System.out.println(arrayClients[i]);		
	}
	public void visualitzacio(String[] arrayClients) {
		
		System.out.println(Arrays.toString(arrayClients));
		lector.nextLine();
	}
	public void Baixa (String[] arrayClients) {
		int num=0;
		System.out.println("Digues el numero del client a borrar");
		num=lector.nextInt();
		arrayClients[num]=arrayClients[num].substring(11);
		System.out.println(arrayClients[num]);
		arrayClients[num]="SiEsborrat".concat(";".concat(arrayClients[num]));
		System.out.println(arrayClients[num]);
	}
	
	public void Recuperacio (String[] arrayClients) {
		int num=0;
		System.out.println("Digues el numero del client borrat");
		num=lector.nextInt();
		arrayClients[num]=arrayClients[num].substring(11);
		System.out.println(arrayClients[num]);
		arrayClients[num]="NoEsborrat".concat(";".concat(arrayClients[num]));
		System.out.println(arrayClients[num]);
	}
	public void Ordenacio (String[] arrayClients) {
		Arrays.sort(arrayClients);
	}
	public void recerca (String[] arrayClients) {
		System.out.println("Inserta el numero de codi d'un client per a veure la seva informació");
		System.out.println(arrayClients[lector.nextInt()]);
	}
}