public class SelectionSortMovieRatings {
    public static void selectionSort(int[] ratings){
        for(int i=0;i<ratings.length-1;i++){
            int min = i;
            for(int j=i+1;j<ratings.length;j++){
                if(ratings[j] < ratings[min]) min = j;
            }
            int temp = ratings[i];
            ratings[i] = ratings[min];
            ratings[min] = temp;
        }
    }
}