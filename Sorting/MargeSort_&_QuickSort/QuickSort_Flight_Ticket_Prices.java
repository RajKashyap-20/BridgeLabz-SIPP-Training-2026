import java.util.*; public class QuickSort_Flight_Ticket_Prices{
static void q(int[]a,int l,int h){if(l<h){int p=part(a,l,h);q(a,l,p-1);q(a,p+1,h);}}
static int part(int[]a,int l,int h){int piv=a[h],i=l;for(int j=l;j<h;j++)if(a[j]<=piv){int t=a[i];a[i]=a[j];a[j]=t;i++;}int t=a[i];a[i]=a[h];a[h]=t;return i;}
public static void main(String[]args){Scanner s=new Scanner(System.in);int n=s.nextInt();int[]a=new int[n];for(int i=0;i<n;i++)a[i]=s.nextInt();q(a,0,n-1);for(int x:a)System.out.print(x+" ");}}
