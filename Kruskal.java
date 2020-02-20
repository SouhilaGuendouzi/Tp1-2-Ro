package com.company;


import java.util.ArrayList;
import java.util.Collections;

public class Kruskal {
     int poids;

    public void Algo_Kruskal(Graphe graphe) {
        ArrayList<Arcs> Arc_Min=new ArrayList<Arcs>();
        if (graphe.Type.equals("Oriente"))
        {
            Collections.sort(graphe.arc); //m sghir l kbir
            for (Arcs c:graphe.arc
                 ) {
                System.out.println(c.s1.title+"\t"+c.s2.title);
            }
            Arc_Min.add(graphe.arc.get(0));
            int j=0;

            boolean stop =false;
            for (j=1;j<graphe.arc.size();j++) {
                int i=0;
                while ((i<Arc_Min.size())&&(stop==false)){
                    Arcs a = new Arcs(graphe.arc.get(j).s2, Arc_Min.get(i).s1);
                    if (Arc_Min.contains(a)) stop =true;
                    i++;
                }
                if ((stop==false)&&(i==Arc_Min.size())) Arc_Min.add(graphe.arc.get(j));

            }


        }
        else if (graphe.Type.equals("Non_Oriente"))
        {
            Collections.sort(graphe.arc); //m sghir l kbir
            for (Arcs c:graphe.arc
            ) {
                System.out.println(c.s1.title+"\t"+c.s2.title);
            }
            Arc_Min.add(graphe.arc.get(0));
            int j=0;

            boolean stop =false;
            for (j=1;j<graphe.arc.size();j++) {
                int i=0;
                stop=false;
                while ((i<Arc_Min.size())&&(stop==false)){

                    Arcs a = new Arcs(graphe.arc.get(j).s2, Arc_Min.get(i).s1);
                    Arcs b=new Arcs(Arc_Min.get(i).s1,graphe.arc.get(j).s2);
                   // Arcs c =new Arcs(graphe.arc.get(j).s1, Arc_Min.get(i).s2);
                   // Arcs d=new Arcs(Arc_Min.get(i).s2,graphe.arc.get(j).s1);
                    if ((Arc_Min.contains(a))||(Arc_Min.contains(b))) stop =true;
                    i++;
                }
                if ((stop==false)&&(i==Arc_Min.size())) Arc_Min.add(graphe.arc.get(j));

            }
        }
        Graphe G_Min=new Graphe();
        G_Min.Nbr_Sommet=graphe.Nbr_Sommet;
        G_Min.Type=graphe.Type;
        G_Min.Nbr_Arc=Arc_Min.size();
        G_Min.arc=Arc_Min;
        G_Min.sm=graphe.sm;
        Matrice_Ponderation mp=new Matrice_Ponderation();
        mp.AffiChage_Ponderation(G_Min);
        int p=0;
        for (Arcs c:G_Min.arc
             ) {
            p+=c.poid;
        }
        this.poids=p;
        System.out.println("le poid est :\t"+this.poids);






    }
}
