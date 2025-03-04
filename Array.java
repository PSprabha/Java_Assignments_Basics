package assignments;
import java.util.*;

public class Array 
{
	static Scanner scan = new Scanner(System.in);

	static void arrayRotation()
	{
		int[] nums = {1,2,3,4,5,6,7,8,9};
		System.out.println("Before rotation");
		System.out.println(Arrays.toString(nums));
		System.out.println();
		System.out.println("Enter how many times the array will rotated!");
		int rotate = scan.nextInt();
		
		for(int j = 0; j < rotate; j++)
		{
			int first = nums[0];
			
			for(int i = 0; i < nums.length-1; i++)
			{
				nums[i] = nums[i+1];
			}
			nums[nums.length-1] = first;
		}

		System.out.println();
		System.out.println("After rotation");
		System.out.println(Arrays.toString(nums));
	}
	
	static void transposeMatrix()
	{
		int[][] nums = {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		
		int[][] nums1 = new int[nums.length][nums[0].length];
 
		System.out.println("Before transpose");
		System.out.println(Arrays.deepToString(nums));
		System.out.println();
		
		for(int i = 0; i < nums.length; i++)
		{
			for(int j = 0; j < nums[i].length; j++)
			{
				nums1[i][j] = nums[j][i];
			}
		}
		
		System.out.println("After transpose");
		System.out.println(Arrays.deepToString(nums1));
	}
	
	
	static void matrixMultiplication()
	{
		int[][]  first= {
				{1,2},
				{3,4,}
		};
		
		int[][] second = {
				{5,6},
				{7,8}
		};
		
		int n = first.length;
		int[][] res = new int[n][n];
		
		for(int i = 0; i < n; i++)
		{
			for(int j = 0; j < n; j++)
			{
				int sum = 0;
				for(int k = 0; k < n; k++)
				{
					sum += (first[i][k] * second[k][j]);
				}
				res[i][j] = sum;
			}
		}
		
		System.out.println(Arrays.deepToString(res));
	}
	
	
	static void spiralMatrix()
	{
		System.out.println("Enter the number of row or column : ");
		int n = scan.nextInt();
		
		int[][] matrix = new int[n][n];
		
		int size = n*n;
		int i = 0, j = 0;
		int nextI = 1, nextJ = 1;
        int startI = 1, startJ = 0;
        int endI = n - 1, endJ = n - 1;
        int count = 1;
        
        while (count <= size) 
        {
            // right
            while (j <= endJ) 
            {
                matrix[i][j] = count++;
                if (count == size+1)
                {
                    System.out.println(Arrays.deepToString(matrix));
                    return;
                }
                j++;
            }
            i++;
            j--;
            
            // down
            while (i <= endI) 
            {
                matrix[i][j] = count++;
                if (count == size+1)
                {
                    System.out.println(Arrays.deepToString(matrix));
                    return;
                }
                i++;
            }
            i--;
            j--;
            
            // left
            while (j >= startJ) 
            {
                matrix[i][j] = count++;
                if (count == size+1)
                {
                    System.out.println(Arrays.deepToString(matrix));
                    return;
                }
                j--;
            }
            j++;
            i--;
            
            // up
            while (i >= startI) 
            {
                matrix[i][j] = count++;
                if (count == size+1)
                {
                    System.out.println(Arrays.deepToString(matrix));
                    return;
                }
                i--;
            }
            
            j = nextJ;
            i = nextI;
            nextI++;
            nextJ++;
            startI++;
            startJ++;
            endI--;
            endJ--;
        }
	}
	
	
	static void jaggedArray()
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number of rows : ");
		int n = scanner.nextInt();
		double[][] weightPersons = new double[n][]; 
		int option ;
		
		do 
		{
			System.out.println("1 .Add Weight ");
			System.out.println("2 .Get Minimum Weight ");
			System.out.println("3. Exit");
			System.out.print("Enter the option : ");
			option =scanner.nextInt();
			
			switch(option) 
			{
			case 1:
				System.out.print("Enter row : ");
				int row = scanner.nextInt();
				System.out.print("Enter the new weight : ");
				double weight = scanner.nextDouble();
				
				if(row >= n)
						System.out.println("Wrong row");
				else 
				{
					weightPersons[row]=addWeight(weightPersons[row],weight);
					System.out.println("New Weight added successfully : "+Arrays.toString(weightPersons[row]));
				}
				break;
				
			case 2:
				System.out.print("Enter row : ");
				int index = scanner.nextInt();
				System.out.println("Minimum weight of person in a row: " + getMinimumWeight(weightPersons[index]));
				break;
				
			case 3:
				System.out.println(Arrays.deepToString(weightPersons));
				return;
			default:
				System.out.println("Invalid Option");
			}
		}
		while(option==1|| option==2);
	}
	
	static double getMinimumWeight(double[] personWeightsArr) 
	{
		if (personWeightsArr.length > 0)
		{
            double min = personWeightsArr[0];
            for (double weight : personWeightsArr)
            {
                if (weight < min) {
                    min = weight;
                }
            }
            return min;
        } else 
        {
            System.out.println("No weights available");
            return 0.0;
        }		
	}
	
	static double[] addWeight(double[] personWeightsArr, double weight) 
	{
		double[] newWeightsArr ;
		if(personWeightsArr != null) 
		{
			newWeightsArr = new double[personWeightsArr.length+1];
			
			for(int i=0;i<personWeightsArr.length;i++)
					newWeightsArr[i]=personWeightsArr[i];
			
	        newWeightsArr[personWeightsArr.length] = weight;
		}
		else 
		{
			newWeightsArr = new double[1];
			newWeightsArr[0]=weight;
		}
        return newWeightsArr;
	}
	public static void main(String[] args) 
	{
		arrayRotation();
		transposeMatrix();
		matrixMultiplication();
		spiralMatrix();
		jaggedArray();
	}

}

