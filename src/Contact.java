import java.util.ArrayList;
import java.util.Arrays;


    public class Contact {Nod head;
        void add(Nod data){
            if(head==null){
                head=data;            }
            else{
                Nod temp=head;
                while(temp.next!=null){
                    temp=temp.next;
                }
                temp.next=data;
            }        }
        String[] sort(ArrayList<String> arr){
            int c=arr.size();
            String[] a=new String[c];
            for (int i = 0; i <arr.size() ; i++) {
                a[i]=arr.get(i);

            }
            Arrays.sort(a);
            return a;
        }   void view2(String[] a){
            for (int i = 0; i <a.length ; i++) {
                Nod n=head;
                while(n!=null){
                    if(n.data.getFirstname()==a[i]){
                        System.out.println(i+1+". "+n.data.getFirstname()+" "+n.data.getLastname());;}
                    n=n.next;
                }}
        }
        void view(String[] a){
            for (int i = 0; i <a.length ; i++) {
                Nod n=head;
                while(n!=null){
                    if(n.data.getFirstname()==a[i]){
                        print(n);}
                    n=n.next;
                }}
        }
        void delete(String string){
            Nod n=head;
            Nod previous=null;
            if (head.data.getFirstname()==string){
                head=n.next;
                n=head;
            }
            else{
                while (n!=null){
                    if(n.data.getFirstname()==string){
                        previous.next=n.next;
                    }
                    previous=n;
                    n=n.next;
                }}
        }
        void search(String a){
            Nod n=head;
            int c=0;
            while (n!=null){
                if(n.data.getFirstname().equals(a)){
                    c++;}
                n=n.next;
            }
            if(c==0) System.out.println("No match found!");
            else if(c==1) System.out.println("1 match found!");
            else System.out.println(c+" matches found!");
            Nod n1=head;
            while (n1!=null){
                if(n1.data.getFirstname().equals(a)){
                    print(n1);
                    n1=n1.next;
                }
                else {n1=n1.next;}
            }
        }
        Main m=new Main();
        void print(Nod n){
            System.out.println("-------- * -------- * -------- * --------");
            String[] s=n.data.getA().split(",");
            if(s.length>1){
                System.out.println("First name: "+n.data.getFirstname()+" \nLast name: "+n.data.getLastname()+" \nContact number(s): "
                        +n.data.getA()+"\nEmail address: "+n.data.getEmail());
                System.out.println("-------- * -------- * -------- * --------");
            }else {System.out.println("First name: "+n.data.getFirstname()+" \nLast name: "+n.data.getLastname()+" \nContact number: "
                    +n.data.getA()+"\nEmail address: "+n.data.getEmail());System.out.println("-------- * -------- * -------- * --------");}
        }
    }
