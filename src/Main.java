import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int y;
        boolean isError=false,isError2 = false;
        String x , burc="";
        System.out.println("Küçük harflerle Doğum Ayınızı giriniz");
        x= input.nextLine();
        System.out.println("Gün giriniz");
        y= input.nextInt();
        if(x.equals("ocak")){
            if(y>=1&&y<=31){
                if(y<22){
                    burc = "Oğlak";
                    isError2 =true;
                        } else {
                    burc="Kova";
                    isError2 =true;
                }
            } else {
                isError =true;
            }
        }
        else if (x.equals("şubat")){
            if(y>=1&&y<=28){
                if(y<20){
                    burc = "Kova";
                    isError2 =true;

                } else {
                    burc="Balık";
                    isError2 =true;
                }
            } else {
            isError =true;
        }
        }
        else if(x.equals("mart")){
            if(y>=1&&y<=31){
                if(y<21){
                    burc = "Balık";
                    isError2 =true;

                } else {
                    burc="Koç";
                    isError2 =true;
                }
            } else {
                isError =true;
            }
        }
        else if(x.equals("nisan")){
            if(y>=1&&y<=30){
                if(y<21){
                    burc = "Koç";
                    isError2 =true;

                } else {
                    burc="Boğa";
                    isError2 =true;
                }
            } else {
                isError =true;
            }
        }
         else if(x.equals("mayıs")){
            if(y>=1&&y<=31){
                if(y<22){
                    burc = "Boğa";
                    isError2 =true;

                } else {
                    burc="İkizler";
                    isError2 =true;
                }
            } else {
                isError =true;
            }
        }
        else if(x.equals("haziran")){
            if(y>=1&&y<=30){
                if(y<23){
                    burc = "İkizler";
                    isError2 =true;

                } else {
                    burc="Yengeç";
                    isError2 =true;
                }
            } else {
                isError =true;
            }
        }
        else if(x.equals("temmuz")){
            if(y>=1&&y<=31){
                if(y<23){
                    burc = "Yengeç";
                    isError2 =true;

                } else {
                    burc="Aslan";
                    isError2 =true;
                }
            } else {
                isError =true;
            }
        }
        else if(x.equals("ağustos")){
            if(y>=1&&y<=31){
                if(y<23){
                    burc = "Aslan";
                    isError2 =true;

                } else {
                    burc="Başak";
                    isError2 =true;
                }
            } else {
                isError =true;
            }
        }
        else if(x.equals("eylül")){
            if(y>=1&&y<=30){
                if(y<23){
                    burc = "Başak";
                    isError2 =true;

                } else {
                    burc="Terazi";
                    isError2 =true;
                }
            } else {
                isError =true;
            }
        }
        else if(x.equals("ekim")){
            if(y>=1&&y<=31){
                if(y<23){
                    burc = "Terazi";
                    isError2 =true;

                } else {
                    burc="Akrep";
                    isError2 =true;
                }
            } else {
                isError =true;
            }
        }
        else if(x.equals("kasım")){
            if(y>=1&&y<=30){
                if(y<22){
                    burc = "Akrep";
                    isError2 =true;

                } else {
                    burc="Yay";
                    isError2 =true;
                }
            } else {
                isError=true;
            }
        }

        else if(x.equals("aralık")){
            if(y>=1&&y<=31){
                if(y<22){
                    burc = "Yay";
                    isError2 =true;

                } else {
                    burc="Oğlak";
                    isError2 =true;
                }
            } else {
                isError =true;
            }
        } else {
            System.out.println("Doğduğunuz ayı yanlış girdiniz, küçük harflerle tekrar deneyiniz.");
        }

        if (isError2){System.out.println("Burcunuz:" + burc);
        }

        if (isError){
            System.out.println("Doğdunuğunuz günü yanlış girdiniz, tekrar deneyiniz.");
        }
    }
}
