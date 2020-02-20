package com.company;

import java.util.ArrayList;
import java.util.Collection;

public class List_Adjacence {

    public List_Adjacence(){}
    public void Afficher_list(Graphe g)
    {

        ArrayList<ArrayList<Sommet>> S =new ArrayList<ArrayList<Sommet>>();
        if (g.Type.equals("Non_Oriente")) {
            for (int i = 0; i < g.sm.size(); i++) {
                ArrayList<Sommet> e = new ArrayList<Sommet>();
                e.add(g.sm.get(i));
                S.add(e);
            }
            for (int i = 0; i < S.size(); i++) //La grande ARRayLISt
            {
                for (int j = 0; j < g.arc.size(); j++) {
                    if (g.arc.get(j).s1.equals(S.get(i).get(0))) S.get(i).add(g.arc.get(j).s2);
                    else if (g.arc.get(j).s2.equals(S.get(i).get(0))) S.get(i).add(g.arc.get(j).s1);
                }

            }
        }
        else if ((g.Type.equals("Oriente"))) {
            for (int i = 0; i < g.arc.size(); i++) {
                ArrayList<Sommet> e = new ArrayList<Sommet>();
                e.add(g.arc.get(i).s1);
                e.add(g.arc.get(i).s2);
                int j = 0;
                boolean stop=false;
                while ((j < S.size())&&(stop==false))
                {if (S.get(j).get(0).equals(g.arc.get(i).s1))
                {
                    S.get(j).add(g.arc.get(i).s2);
                    stop=true;
                }else j++;}

                if (j == S.size()) S.add(e);
            }

            //Afichafe de la list
            System.out.println("LIST D'ADJACENCE ");
            for (int i = 0; i < S.size(); i++) {
                for (int j = 0; j < S.get(i).size(); j++) {
                    System.out.print(S.get(i).get(j).title + "\t");
                }
                System.out.println("\n");
            }
        }



    }
}
