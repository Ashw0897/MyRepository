package com.phoenix.demos;

import java.lang.reflect.Array;

interface IAvrage
{
	double avg(int[] array);
}
public class LambadaExpressionEx {

public static void main(String[] args) {
        
        //Without lambda expression, Iaverage implementation using anonymous class
        IAvrage average=new IAvrage() {
            
            @Override
            public double avg(int[] array) {
                
                double sum=0;
                int arraySize=array.length;
                System.out.println(arraySize);
                
                for(int i=0;i<array.length;i++)
                {
                    sum+=array[i];
                }
                return sum/arraySize;
            }
        };
        
        
        
        int array[]= {1,4,8,9,12};
        System.out.println(average.avg(array));
        
        
   //Using lambda expression        
        IAvrage withLambda=(withLambdaArray)->
        {
            double sum=0;
            int arraySize=array.length;
            System.out.println(arraySize);
            
            for(int i=0;i<array.length;i++)
            {
                sum+=array[i];
            }
            return sum/arraySize;
        };
        
        System.out.println(withLambda.avg(array));
    }


}
