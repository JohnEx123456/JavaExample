
// java Example _ flopping arrays 2021 feb 4
class Main{ 
   
static void revArrayAllCols(int arr[][]) 
{ 
    int rows = arr.length; // rows
    int cols = arr[0].length; // cols
    // loop through all Cols
    for (int i = 0; i < cols; i++) { 
        revArrayOneCol(arr,i);
    } 
}
   
static void revArrayOneCol(int arr[][], int c) 
{ 
    int rows = arr.length; //rows
    int cols = arr[0].length; //cols
    int end = rows - 1; // end of col index

    if (c>cols-1) {
      System.out.println("bad col index "+c);
      return;
    }
    
    // loop to the middle, swapping 
    for ( int start=0; start<end; start++)
    { 
        // Swap s and e the elements 
        int temp      = arr[start][c]; 
        arr[start][c] = arr[end][c]; 
        arr[end][c]   = temp; 
        end--; 
    }
}

static void revArrayAllRows(int arr[][]) 
{ 
    int rows = arr.length; // rows
    int cols = arr[0].length; // cols
    // loop through all rows 
    for (int i = 0; i < rows; i++) { 
        revArrayOneRow(arr,i);
    } 
}

static void revArrayOneRow(int arr[][], int r) 
{ 
    int cols = arr[0].length; // Cols
    int rows = arr.length; // rows
    int end = cols - 1; // end of row index
    
    if (r>rows-1) {
      System.out.println("bad row index "+r);
      return;
    }
    
    // loop to the middle, swapping 
    for ( int start=0; start<end; start++)
    { 
        // Swap s and e the elements 
        int temp      = arr[r][start]; 
        arr[r][start] = arr[r][end]; 
        arr[r][end]   = temp; 
        end--; 
    }
}

static void prtArray(int arr[][]) 
{ 
    int rows = arr.length;
    int cols = arr[0].length;
    // Print the arr[][] after 
    // reversing every row 
    for (int r = 0; r < rows; r++) { 
        for (int c = 0; c < cols; c++) { 
            System.out.print(arr[r][c] + " "); 
        } 
        System.out.println(); 
    } 
    
    for (int c = 0; c < cols; c++) { 
        System.out.print("--"); 
    } 
    System.out.println("");
} 
  
// Driver Code 
public static void main(String[] args) 
{ 
    int arr[][] = { { 1, 2, 3, 4 }, 
                    { 4, 5, 6, 4 }, 
                    { 7, 8, 9, 4 } }; 
   
    System.out.println("v2");
    prtArray(arr);
    revArrayAllRows(arr);
    prtArray(arr);
    revArrayAllCols(arr);
    prtArray(arr);
    revArrayOneRow(arr,2);
    prtArray(arr);
    revArrayOneCol(arr,2);
    prtArray(arr);
} 
} 