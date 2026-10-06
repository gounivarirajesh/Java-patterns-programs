/**
 * 
 Problem 1 
 * StarPatternDemo
 *
    * * * * *
    * * * * *
    * * * * *
    * * * * *
 * 
 * 
 */
public class StarPatternDemo {

    
public static void main(String[] args) {
 // star pattern program   
for (int i =1;i<=5;i++)
{
    for(int j=1;j<=5;j++)
    {
        System.out.print("*"+" ");
     }
    System.out.println();
}

System.out.println();
// Number pattern 
/* 

Problem 2

1 1 1 1 
2 2 2 2 
3 3 3 3 
4 4 4 4 


*/
for(int i=1; i<=4;i++)
{
    for(int j=1;j<=4;j++)
    {
        System.out.print(i+" ");
    }
    System.out.println();
}

/*
Problem 3

1 2 3 4 5
1 2 3 4 5
1 2 3 4 5
1 2 3 4 5 
1 2 3 4 5 

*/

System.out.println();

for(int i=1;i<=5;i++)
{
    for(int j=1;j<=5;j++)
    {
        System.out.print(j+" ");
    }
    System.out.println();
}
/*
Problem 4
5 5 5 5 5
4 4 4 4 4
3 3 3 3 3
2 2 2 2 2
1 1 1 1 1

*/

System.out.println();

for(int i=5; i>=1;i--)
{
    for(int j=1;j<=5;j++)
    {
    System.out.print(i+" ");
     }
     System.out.println();

}


System.out.println();
/*
problem 5

5 4 3 2 1
5 4 3 2 1
5 4 3 2 1
5 4 3 2 1 



*/

for(int i =5;i>=1;i--)
{
    for(int j=1;j<=5;j++)
    {
        System.out.print(i+" ");
    }
    System.out.println();
}


System.out.println();


/*
Problem 6

5 5 5 5 5 
4 4 4 4 4 
3 3 3 3 3 
2 2 2 2 2 
1 1 1 1 1 


*/
for(int i =5;i>=1;i--){
    for(int j=5;j>=1;j--)
    {
        System.out.print(j+" ");
    }
    System.out.println();
}


System.out.println();

/*
Problem 7

5 5 5 5 5 
4 4 4 4 4 
3 3 3 3 3 
2 2 2 2 2 
1 1 1 1 1 

*/

for(int i =5;i>=1;i--){
    for(int j=5;j>=1;j--)
    {
        System.out.print(i+" ");
    }
    System.out.println();
}


System.out.println();

/*

Problem 8 

1  2  3  4  5 
 6  7  8  9 10 
11 12 13 14 15 
16 17 18 19 20 
21 22 23 24 25 

*/

int k =1,n=5;


for (int i=1;i<=n;i++)
{
    for(int j=1;j<=n;j++)
    {
        System.out.printf("%2d ",k);
        k++;
    }
 System.out.println();
}


System.out.println();

/*


Problem 9

1  3  5  7  9 
11 13 15 17 19 
21 23 25 27 29 
31 33 35 37 39 
41 43 45 47 49 
*/


int oddseries=1,size=5;


for (int i=1;i<=size;i++)
{
    for(int j=1;j<=size;j++)
    {
        System.out.printf("%2d ",oddseries);
        oddseries=oddseries+2;
    }
 System.out.println();
}

System.out.println();

/*
Problem 10 

 2  4  6  8 10 
12 14 16 18 20 
22 24 26 28 30 
32 34 36 38 40 
42 44 46 48 50 

*/

int evenseries=2,lenght=5;


for (int i=1;i<=lenght;i++)
{
    for(int j=1;j<=lenght;j++)
    {
        System.out.printf("%2d ",evenseries);
        evenseries=evenseries+2;
    }
 System.out.println();
}

System.out.println();


//problem 11
/*
 1  2  3  4  5 
 2  4  6  8 10 
 3  6  9 12 15 
 4  8 12 16 20 
 5 10 15 20 25 
*/
int  rc=5;
for (int i=1;i<=rc;i++)
{
    for(int j=1;j<=rc;j++)
    {
        System.out.printf("%2d ",(i*j));
    
    }
 System.out.println();
}

System.out.println();

}
}


