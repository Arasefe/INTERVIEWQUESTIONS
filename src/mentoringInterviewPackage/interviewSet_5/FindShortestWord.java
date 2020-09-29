package mentoringInterviewPackage.interviewSet_5;

public class FindShortestWord {
    //10.Write a program that will print the shortest word in the given array
    public static void main(String[] args) {
        findShortestString(new String[]{"Aras","Efe","Banu","Iso","Tulpar"});
        findLongestString(new String[]{"Aras","Efe","Banu","Iso","Tulpar"});
    }

    public static void findShortestString(String [] array){
        String shortest="";
        for (int i = 0; i < array.length; i++) {
            shortest=array[i];
            for (int j = 0; j < array.length; j++) {
                if(array[j].length()< array[i].length()){
                    shortest=array[j];
                }
            }
        }
        System.out.println("shortest = " + shortest);
    }

    public static void findLongestString(String []array){
        String longest="";
        for (int i = 0; i < array.length; i++) {
            longest=array[i];
            for (int j = 0; j < array.length; j++) {
                if(array[j].length()>array[i].length()){
                    longest=array[j];
                }
            }
        }
        System.out.println("longest = " + longest);
    }
}
