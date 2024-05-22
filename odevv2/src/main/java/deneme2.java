import java.util.Scanner;
public class deneme2 {
   
public static void main(String[] args) {

int a,b,i,j,sum=0,summ=0;
Scanner klv=new Scanner(System.in);

System.out.println("kaca kaclik bir matris carpimi istiyorsunuz ?");
System.out.print("1.matrisin satir sayisi :");
a=klv.nextInt();
System.out.println();

System.out.print("1.matrisin sutun sayisi :");
b=klv.nextInt();
System.out.println();



int mata[][]=new int[a][b];

System.out.println();


System.out.println("============================================");
System.out.println("birinci matrisin sayilarini girin");
for(i=0;i<a;i++){
for(j=0;j<b;j++){
System.out.print((i+1)+". satir "+(j+1)+". sutun elemani : ");
mata[i][j]=klv.nextInt();
}
System.out.println();
}
System.out.println();

System.out.println();
System.out.println();

for(i=0;i<a;i++){
for(j=0;j<b;j++)
System.out.print(mata[i][j]+"\t");
System.out.println();
}
System.out.println("===========================================");


System.out.println("===========carpim sonucu==================");





//çarpma işleminin yapıldığı bölüm
for(j=0;j<b;j++){
for(i=0;i<a;i++){
sum+=mata[i][j];
System.out.println();
}
    System.out.println(j+". sutunun toplami:"+sum);
sum=0;}
for(i=0;i<a;i++){
for(j=0;j<b;j++){
summ+=mata[i][j];
System.out.println();
}
    System.out.println(i+". satirin toplami:"+summ);
summ=0;}

}
}


