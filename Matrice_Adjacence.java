package com.company;

public class Matrice_Adjacence {


    public Matrice_Adjacence(){}

    public void AffiChage( Graphe graphe )
    { String [][] Tab = new String [graphe.sm.size()+1][graphe.sm.size()+1];
        int i,j;
        Tab[0][0]=" ";
        for (i=1;i<=graphe.Nbr_Sommet;i++)
            Tab[0][i] = graphe.sm.get(i-1).title;
        for (i=1;i<=graphe.Nbr_Sommet;i++)
            Tab[i][0]= graphe.sm.get(i-1).title;


       if (graphe.Type.equals("Oriente")) {
           for (i = 1; i < Tab.length; i++) //ligne

               for (j = 1; j < Tab.length; j++) //colonne

               {
                   Arcs a = new Arcs(new Sommet(Tab[i][0]), new Sommet(Tab[0][j]));
                   if (graphe.arc.contains(a)) Tab[i][j] = "1";
                   else Tab[i][j] = "0";
               }
       }
       else if(graphe.Type.equals("Non_Oriente")) {
           for (i = 1; i < Tab.length; i++) //ligne

               for (j = 1; j < Tab.length; j++) //colonne

               {
                   Arcs a = new Arcs(new Sommet(Tab[i][0]), new Sommet(Tab[0][j]));
                   Arcs b = new Arcs(new Sommet(Tab[0][j]), new Sommet(Tab[i][0]));
                   if ((graphe.arc.contains(a))||graphe.arc.contains(b)) Tab[i][j] = "1";
                   else Tab[i][j] = "0";
               }

       }
        System.out.println("MATRICE D'ADJACENCE ");
        for (i=0;i<Tab.length;i++)
        {
            for (j=0;j<Tab.length;j++)
            {
                if (j==graphe.Nbr_Sommet) System.out.println(Tab[i][j]+"\n");
                else System.out.print(Tab[i][j]+"\t");
            }

        }



    }



}
