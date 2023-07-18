import System.util.Scanner;
class SystimaDieythynsis{
    public void vazeiEmpros(){
        System.out.println(" oxima vazei empros");
    }
    public void svynei(){
        System.out.println("to oxima svinei");
    }
    public void striveiAristera(){
        System.out.println("to oxima strivei aristera");
    }
    public void striveiDexia(){
        System.out.println("to oxima strivei dexia");
    }
}
class Mihani{
    private int kyvismos;
    private int ippodynami;
    public Mihani(){

    }
    public Mihani(int k, int ip){
        kyvismos = k;
        ippodynami = ip;
    } 
    public void setKyvismos(int k){
        kyvismos = k;
    }
    public void setIppodynami(int ip){
        ippodynami = ip;
    }
    public int getKyvismos(){
        return kyvismos;
    }
    public int getIppodynami(){
        return ippodynami;
    }
    public void leitourgia(){
        System.out.println("oxima se leitourgia");
    }
    public void kinisi(){
        System.out.println("oxima se kinisi");
    }
    public void svisimo(){
        System.out.println("oxima esvise");
    }
}
class Vehicle{
    private String idioktitis;
    private String arKykloforias;
    private int etosKat;
    private SystimaDieythynsis sysdief;
    private MIhani eng; 


    public Vehicle (){

    }
    public Vehicle(int ek,SystimaDieythynsis sd,MIhani e){
        etosKat = ek;
        sysdief = sd;
        eng = e;
    }
    public Vehicle(String id,String ak,int ek,SystimaDieythynsis sd,MIhani e){
        idioktitis = id;
        arKykloforias = ak;
        etosKat = ek;
        sysdief = sd;
        eng = e;
    }
    public void setIdioktitis(String id){
        idioktitis = id; 
    }
    public void setArKykloforias(String ak){
        arKykloforias = ak;
    }
    public void setEtosKat(int ek){
        etosKat = ek;
    }
    public void setSysdief(SystimaDieythynsis sd){
        sysdief = sd;
    }
    public void setEng(Mihani e){
        eng = e;
    }
    public String getIddioktitis(){
        return iddioktitis;
    }
    public String getArKykloforias(){
        return arKykloforias;
    }
    public int getEtoskat(){
        return etosKat;
    }
    public SystimaDieythynsis getSysdief(){
        return sysdief;
    }
    public Mihani getEng(){
        return eng;
    }
    public String toText(){
        return ("\n idioktitis: "+idioktitis+"\n Arithmos kykloforias: "+arKykloforias+
        "\n Etos kataskevis: "+etosKat+"\n Kyvismos: "+eng.getKyvismos+"\n Ippodynami: "+eng.getIppodynami);
    }
}
public class TestVehicle{
    public static void Main(String[] args){
        int n = 3;
        Vehicle[] V = new Vehicle[n];  
        Mihani E = new Mihani();
        Scanner myobj = new Scanner(System.in);
        for(int i=0;i<n;i++){
            SystimaDieythynsis S = new SystimaDieythynsis();
            System.out.println("kataxorisi kyvikon");
            int ky = myobj.nextInt();
            System.out.println("kataxorisi ippodinamis");
            int ip = myobj.nextInt();
            e = new Mihani(kyv,ipp);
            System.out.println("kataxorisi etous kykloforias");
            int eto = myobj.nextInt();
            V[i]=new Vehicle(et,s,e);
            System.out.println("kataxorisi onoma katoxou");
            String na = myobj.next();
            System.out.println("kataxorisi arithmos kykloforias");
            String ak = myobj.next();
            V[i].setIdioktitis(na);
            V[i].setArKykloforias(ak);
        }
        
    
        System.out.println("gia poio vehicle 8elete kyvismo?");
        int k = myobj.nextInt();
        System.out.println("to vehicle"+k+"exei kyvismo: "+V[k].getEng().getKyvismos());
        System.out.println("gia poio vehicle 8elete ippodinami?");
        k = myobj.nextInt();
        System.out.println("to vehicle"+k+"exei ippodianmi: "+V[k].getEng().getIppodynami());
        System.out.println("gia poio vehicle 8elete idioktiti kai etos kataskevis?");
        k = myobj.nextInt();
        System.out.println("to vehicle"+k+"exei idioktiti: "+V[k].getIddioktitis()+"kai etos kataskevis: "+V[k].getEtoskat());
    }
}
