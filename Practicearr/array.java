public class array {
    public static void main(String []args){
        int [] num ={1,2,1,1,6,7,8,9};
        int ele = 1;
        int index = 0;
        for(int i = 0; i < num.length; i++){
            if(num[i] != ele){
                num[index++] = num[i];
            }
        }
        for(int i = index; i < num.length; i++){
            if(i<index){
                System.out.println(num[i]);
            }
            else{
                num[i]=ele;
                System.out.println(num[i]);
                }
                
        }

}
}