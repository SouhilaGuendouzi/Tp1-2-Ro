package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class WelshPowell {
       String [] Couleur = new String [30];
       public WelshPowell()
       {
           this.Couleur[0]="Rouge";
           this.Couleur[1]="Bleu";
           this.Couleur[2]="Vert";
           this.Couleur[3]="Mauve";
           this.Couleur[4]="Blanc";
           this.Couleur[5]="Noir";
           this.Couleur[6]="Orange";
           this.Couleur[7]="Rose";
           this.Couleur[8]="Jaune";
           this.Couleur[9]="Marron";
       }
       ArrayList<Sommet> Sommet_Fils= new ArrayList<Sommet>();


    public void Colorer(Graphe G)
    {
        Collections.sort(G.sm); //mal kbir l sghir ana reglitha fel classe sommet
        int i=0;
        int j=0;
        int k;
        boolean stop;
            while (i < G.sm.size()) {
                if (G.sm.get(i).Couleur == null) {
                    G.sm.get(i).Couleur=this.Couleur[j];
                    Sommet_Fils.add(G.sm.get(i));
                    int z=i+1;
                    while (z<G.sm.size())
                    {
                         if (G.sm.get(z).Couleur==null) {

                             Arcs a = new Arcs(G.sm.get(i), G.sm.get(z));
                             Arcs b = new Arcs(G.sm.get(z), G.sm.get(i));

                             if ((!G.arc.contains(a)) && (!G.arc.contains(b))) {
                                 if (Sommet_Fils.size() == 1)
                                 {
                                     G.sm.get(z).Couleur = this.Couleur[j];
                                     Sommet_Fils.add(G.sm.get(z));
                                 }
                                 else {
                                     k=1;
                                     stop=false;
                                     while ((stop == false) && (k <Sommet_Fils.size())) {
                                         a = new Arcs(Sommet_Fils.get(k), G.sm.get(z));
                                         b = new Arcs(G.sm.get(z), Sommet_Fils.get(k));
                                         if ((G.arc.contains(a)) || (G.arc.contains(b))) stop = true;
                                         else k++;
                                     }
                                     if (stop == false)
                                     {
                                         G.sm.get(z).Couleur = this.Couleur[j];
                                         Sommet_Fils.add(G.sm.get(z));
                                     }


                                 }
                             }
                         }
                        z++;
                    }
                    Sommet_Fils.clear();
                    j++;
                }
                i++;

            }
        System.out.println("le Nombre de couleurs est :"+"\t"+j);
        for (Sommet s:G.sm
             ) {
            System.out.println(s.title+"\t"+s.Couleur);

        }

    }

}
