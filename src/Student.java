package studentalign;

import java.util.*;



public class Student

{

    private String name;

    private String idnum;

    private String major;

    private String gradDate;

    private int numGrades;

    private int [] grades = new int[numGrades];

    private double average;



    public Student1()

    {



    }



    public Student1(String n, String id, String m, String g, int ng, int[] gs,double a)

    {

        name = n;

        idnum = id;

        major = m;

        gradDate = g;

        numGrades = ng;

        grades = gs;

        average = a;

    }



    public String getName()

    {

        return name;

    }



    public void setName(String name)

    {

        this.name = name;

    }



    public String getIdnum()

    {

        return idnum;

    }



    public void setIdnum(String idnum)

{

        this.idnum = idnum;

    }



    public String getMajor()

    {

        return major;

    }



    public void setMajor(String major)

    {

        this.major = major;

    }



    public String getGradDate()

    {

        return gradDate;

    }



    public void setGradDate(String gradDate)

    {

        this.gradDate = gradDate;

    }



    public int getNumGrades()

    {

    return numGrades;

    }



    public void setNumGrades(int numGrades)

    {

        this.numGrades = numGrades;

    }



    public int[] getGrades()

    {

        return grades;

    }



    public void setGrades(int[] grades)

    {

        this.grades = grades;

    }



    public double getAverage()

    {

        return average;

    }



    public void setAverage(double average)

    {

        this.average = average;

    }

    public void calcAverage()

    {

        int i = this.getNumGrades();

        int[] g = this.getGrades();

        double total = 0;

        for(int o=0; o<i; o++)

            total += g[o];
        this.setAverage(total/i);

    }

    public String mySetw(String s, int size)

        {

        String x = s;

        for (int i = s.length(); i < size; i++)

            x += " ";

        return x;

        }

    public void readGrades()

    {
        Scanner kb = new Scanner(System.in);

        int g, count=0;

        System.out.println("Please enter the Students grades. " +

                "When you are done enter a negative number: ");

        g =kb.nextInt();

        while(g>-1)

        {

            this.grades[count] = g;

            System.out.println("What is the next grade: ");

            g=kb.nextInt();

            count++;

        }

        this.setNumGrades(count + 1);

    this.calcAverage();

    }

}
