package Rostro;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class parte_rostro {
   //Partes del rostro
    private partes_rostro cabello;
    //private partes_rostro cabeza;
    private partes_rostro nariz;
    private partes_rostro ojos;
    private partes_rostro labios;
   // private partes_rostro mandibula;
    private partes_rostro cejas;
    private partes_rostro bigote;
    

    public parte_rostro(Dimension contendor){
        cabello     = new partes_rostro("cabello");
       // cabeza      = new partes_rostro("cabeza");
        nariz       = new partes_rostro("nariz" );
        ojos        = new partes_rostro("ojos");
        labios      = new partes_rostro("labios" );
       // mandibula   = new partes_rostro("mandibula" );
        cejas       = new partes_rostro("cejas" );
        bigote      = new partes_rostro("bigote" );
    }

    //Cambia una parte del rostro
    //Entrada: Parte-del-rostro_imagen de tipo String
    public void cambiar_parte_del_rostro(String value){
        String[] val = value.split("_");//divide el comando en dos
        //valores, uno literal y el otro entero
        if( val[0].equals("nariz"))        
            nariz.setImagen( Integer.valueOf(val[1]));
        else if( val[0].equals("ojos"))
            ojos.setImagen( Integer.valueOf(val[1]));
        else if( val[0].equals("labios"))
            labios.setImagen( Integer.valueOf(val[1]));
        else if( val[0].equals("cabello"))
            cabello.setImagen( Integer.valueOf(val[1]));
        //else if( val[0].equals("cabeza"))
          //  cabeza.setImagen( Integer.valueOf(val[1]));
      // else if( val[0].equals("mandibula"))
        //   mandibula.setImagen( Integer.valueOf(val[1]));
        else if( val[0].equals("cejas"))
            cejas.setImagen( Integer.valueOf(val[1]));
        else if( val[0].equals("bigote"))
            bigote.setImagen( Integer.valueOf(val[1]));        
    }

    public void dibujar(Graphics g) {
        Graphics2D g2 = (Graphics2D)g;
      //  g2.drawImage(cabeza.getImagen(),0,0, null);
       // g2.drawImage(mandibula.getImagen(), 0,0, null);
        g2.drawImage(nariz.getImagen(),0,0, null);
        g2.drawImage(ojos.getImagen(), 0,0, null);
        g2.drawImage(labios.getImagen(), 0,0, null);
        g2.drawImage(cabello.getImagen(), 0,0, null);
        g2.drawImage(cejas.getImagen(), 0,0, null);
        g2.drawImage(bigote.getImagen(), 0,0, null);
    }

}
