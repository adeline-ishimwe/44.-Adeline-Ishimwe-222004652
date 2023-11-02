public class ELSELADDER {  
    public static void main(String[] args) {  
        int goals=65;  
          
        if(goals<50){  
            System.out.println("not allowed to attend league");  
        }  
        else if(goals>=50 && goals<60){  
            System.out.println("any player can make the team up or down");  
        }  
        else if(goals>=60 && goals<70){  
            System.out.println("remain two session player");  
        }  
        else if(goals>=70 && goals<80){  
            System.out.println("remain one session player");  
        }  
        else if(goals>=80 && goals<90){  
            System.out.println("succeed to attend the league");  
        }else if(goals>=90 && goals<100){  
            System.out.println("the champions");  
        }else{  
            System.out.println("Invalid!");  
        }  
    }  
    }  