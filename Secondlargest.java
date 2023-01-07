//to find the second largest element after swapping


class HelloWorld {
    public static void main(String[] args) {
        int a[]={1,3,2};
        int i,j;
        for(i=0;i<3;i++){
            for(j=0;j<3;j++){
                if(a[i]<a[j]){
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }int max=a[0],smax=[0];
     
        for(i=0;i<3;i++){
            if(a[i]>max ){
                smax=max;
                max=a[i];
            }
           }
        
        if(smax==max){
          System.out.println("same");
         }
         
         else{
        
        //System.out.println(a);
        System.out.println(smax);
        //System.out.println(max);
        }
        }
        }
    }
