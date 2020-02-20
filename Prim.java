package com.company;

import java.util.ArrayList;

public class Prim {
    ArrayList<Arcs> F=new ArrayList<Arcs>();
    ArrayList<Arcs> Co=new ArrayList<Arcs>();
    ArrayList<Sommet> U =new ArrayList<Sommet>();
    int NbS,Nba;
    int poid;

    public Arcs Min_Arc(ArrayList<Arcs> l)
    {

        Arcs Min =l.get(0);
        for (int i=1;i<l.size();i++)
        {
            if (l.get(i).poid<Min.poid) Min=l.get(i);
        }
        return Min;

    }

    public void Prim_Afficher(Graphe G) {
        if (G.Type.equals("Oriente")) {

            U.add(G.sm.get(0));
            NbS = 1;

            for (int i = 0; i < G.arc.size(); i++) {
                if (G.arc.get(i).s1.equals(G.sm.get(0))) Co.add(G.arc.get(i));
            }

            Arcs next = Min_Arc(Co);
            F.add(next);
            Nba = 1;
            U.add(next.s2);
            NbS++;
            Co.remove(next);
            while (U.size() < G.Nbr_Sommet)// ((Co.size()!=0) ||(NbS<= G.Nbr_Sommet))
            {
                System.out.println(" I am here");
                Sommet s = U.get(U.size() - 1);
                for (int j = 0; j < G.arc.size(); j++) {
                    if ((G.arc.get(j).s1.equals(s)) && (!U.contains(G.arc.get(j).s2))) Co.add(G.arc.get(j));
                }
                for (int j = 0; j < Co.size(); j++) {
                    System.out.println(Co.get(j).s1.title + "\t" + Co.get(j).s2.title);
                }
                if (Co.size() != 0) {
                    next = Min_Arc(Co);
                    F.add(next);
                    Nba++;
                    U.add(next.s2);
                    NbS++;
                    for (int j = 0; j < U.size() - 1; j++) {
                        Arcs a = new Arcs(U.get(j), U.get(U.size() - 1));
                        if (Co.contains(a)) Co.remove(a);
                    }
                }

            }
        }
        else if (G.Type.equals("Non_Oriente"))
        {
            U.add(G.sm.get(0));
            NbS = 1;

            for (int i = 0; i < G.arc.size(); i++) {
                if ((G.arc.get(i).s1.equals(G.sm.get(0))) ||(G.arc.get(i).s2.equals(G.sm.get(0)))) Co.add(G.arc.get(i));
            }

            Arcs next = Min_Arc(Co);
            F.add(next);
            Nba = 1;
            if (next.s1.equals(G.sm.get(0))) U.add(next.s2);
            else U.add(next.s1);
            NbS++;
            Co.remove(next);
            while (U.size() < G.Nbr_Sommet)// ((Co.size()!=0) ||(NbS<= G.Nbr_Sommet))
            {
                System.out.println(" I am here");
                Sommet s = U.get(U.size() - 1);
                for (int j = 0; j < G.arc.size(); j++) {
                    if ((G.arc.get(j).s1.equals(s)) && (!U.contains(G.arc.get(j).s2))) Co.add(G.arc.get(j));
                      else if ((G.arc.get(j).s2.equals(s)) && (!U.contains(G.arc.get(j).s1))) Co.add(G.arc.get(j));
                }
               /* for (int j = 0; j < Co.size(); j++) {
                    System.out.println(Co.get(j).s1.title + "\t" + Co.get(j).s2.title);
                }*/
                if (Co.size() != 0) {
                    next = Min_Arc(Co);
                    F.add(next);
                    Nba++;
                    if (U.contains(next.s1)) U.add(next.s2);
                    else U.add(next.s1);
                    NbS++;
                    for (int j = 0; j < U.size() - 1; j++) {
                        Arcs a = new Arcs(U.get(j), U.get(U.size() - 1));
                        Arcs b= new Arcs( U.get(U.size() - 1),U.get(j));
                        if (Co.contains(a)) Co.remove(a);
                        if (Co.contains(b)) Co.remove(b);
                    }
                }

            }
        }
        Graphe G_Min = new Graphe();
        G_Min.arc=F;
        G_Min.Nbr_Arc=Nba;
        G_Min.sm=U;
        G_Min.Nbr_Sommet=NbS;
        G_Min.Type=G.Type;
        Matrice_Ponderation m=new Matrice_Ponderation();
        System.out.println("L'ANCIENNE MATRICE "+"\t");
        m.AffiChage_Ponderation(G);
        System.out.println("LA NOUVELLE MATRICE "+"\t");
        m.AffiChage_Ponderation(G_Min);
        int p=0;
        for (Arcs c:G_Min.arc
             ) {
            p+=c.poid;
        }
        this.poid=p;
        System.out.println("le poid est \t"+this.poid);

    }

}
