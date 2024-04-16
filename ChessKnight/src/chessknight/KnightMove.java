/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chessknight;
import java.util.Scanner;
/**
 *
 * @author matte
 */
public class KnightMove {
double num;                                        //inizializzo le variabili
double lettera;

public void get(int n, char l){    //converto le varabili in intero e char
    
this.num=n;
this.lettera=l;   
}

public void mosse(int n, char l){
  Scanner S= new Scanner(System.in); 
  
    int p=1;
    
    
  
char calcolol;  //calcolo della lettera
int calcolon;     //calcolo del numero

n=1;     // assegno i valori b e 1, che tradotto in cordinate è il punto di partenza del cavallo bianco 
l='b';


System.out.println("Benvenuto! con questo programma potrai simulare il muovimento di un cavallo bianco che parte dalla casella b1. ");
System.out.println("N.b, i numeri negativi vanno verso sinistra e verso il basso, i positivi verso destra e verso l'alto");

while( p==1){
System.out.println("Di quante caselle orizzontali ti vuoi muovere");
System.out.println("Mosse possibili (attento ai limiti della scacchiera) : +1,+2,-1,-2");   
int a = S.nextInt();   //tramite questo comando l'utente può inserire la cordinata orizzontale
 
//di seguito ci sono una serie di calcoli che servono per calcolare il valore della nuova lettera

    int valoreChar = (int) l;      //qui si converte la lettera in un numero intero per permettere il calcolo
    
    int ris = valoreChar + a;      // qui si esegue il calcolo
  
   calcolol = (char) ris;          // qui si concerte nuovamente il calcolo in char

    

   
   if(a>2 || a<-2){                    // controllo per verofocare che l'utente non inserisce un valore superiore di 2 o minore di -2
System.out.println("E' stato inserito un valore errato");  
}
   
    
else if(ris <'a'|| ris>'h'){                                   //questo è il rimo controllo che verifica che la mossa non esce fuori dalla scacchiera orizzontalmente
    System.out.println("sei uscito dai limiti della scacchiera");
}    

else{    // se il valore inserito supera entrambi i controlli allora esce il messaggio della mossa valida e si può proseguire con la messo in verticale
System.out.println("Mossa valida");
System.out.println("Di quante caselle verticali ti vuoi spostare?");




//qui bisogna specificare due casi diversi. Se l'utente si è spostato di 2 orizzontalmente può muoversi solo di uno in verticale
//se si è mosso di 1 in orizzontale può muoversi di due in verticale


if(a==2 || a==-2){ //controllo della mossa orizzontale
System.out.println("Dato che ti sei mosso di due caselle orizzontali, puoi muoverti di una sola verticale");
System.out.println("Mosse valide: +1,-1");
int b = S.nextInt();   //l'utente inserisce di quanto si vuole muovere

if(b>1 || b<-1 || b==0){  //controllo per assicurarsi che l'utente non ha inserito un valore che va oltre 1 e -1
System.out.println("E' stato inserito un valore errato"); 
return;
}



//se passa il controllo allora si può effettuare il calcolo del nuovo numero 
calcolon=n+(b);

if(calcolon>8 || calcolon<1){
System.out.println("sei uscito dai limiti della scacchiera");
return;//se il calcolo viene minore di 1 o maggiore di 8 vuol dire che l'utente è uscito dai limiti della scacchiera 
}

else{      // se non si verifica nessun errore, il programma stampa il risultato
    String risultato="";
    risultato=""+ calcolol +""+calcolon;
    System.out.println("Mossa valida");
    System.out.println("Adesso il tuo cavallo si trova in " + risultato);
     System.out.println("Premere 1 per continuare, altrimenti premere un numero casuale per chiudere il programma");
       
     
    
    
    
}

}

if(a==1 || a==-1){ //controllo della mossa orizzontale
System.out.println("Dato che ti sei mosso di una casella orizzontale, puoi muoverti di due caselle verticali");
System.out.println("Mosse valide: +2,-2");
int b = S.nextInt(); //l'utente inserisce di quanto si vuole muovere


if(b>2 || b<-2){          //controllo per assicurarsi che l'utente non ha inserito un valore che va oltre 2 e -2
System.out.println("E' stato inserito un valore errato"); 
return;
}

if(b==1 || b==-1 || b==0){   //controllo per assicurarsi che l'utente non ha inserito i valori intermedi tra -2 e 2
System.out.println("E' stato inserito un valore errato");   
return;
}



//se passa il controllo allora si può effettuare il calcolo del nuovo numero
calcolon=n+(b);
if(calcolon>8 || calcolon<1){   //se il calcolo viene minore di 1 o maggiore di 8 vuol dire che l'utente è uscito dai limiti della scacchiera 
    
System.out.println("sei uscito dai limiti della scacchiera");    
}

else{// se non si verifica nessun errore, il programma stampa il risultato
    String risultato="";
    risultato=""+ calcolol +""+calcolon;
    System.out.println("Mossa valida");
    System.out.println("Adesso il tuo cavallo si trova in " + risultato);
    System.out.println("Premere 1 per continuare, altrimenti premere un numero casuale per chiudere il programma");
        
   
    
}    
 }   
    p = S.nextInt();    






  }  
    

 
 










}

}
}