public class JobScheduling {
    public static  int jobScheduling(int[] s, int[] e, int[] p) {
        return fun(s,e,p,s.length-1,0,s.length-1,Integer.MAX_VALUE);
    }
    public static int fun(int []s, int []e, int []p, int ind, int pro, int n, int free)
    {
        if(ind == n-1)return p[ind] + pro;

        int pick = 0;
        int not = 0;
        if(e[ind] <= free)
        {
            pick = fun(s,e,p,ind-1,pro+p[ind],n,e[ind]);
        }
        not = fun(s,e,p,ind-1,pro,n,free);
        return Math.max(pick, not);
    }
    public static void main(String []args)
    {
        int []s = {1,2,3,4,6};
        int []e = {3,5,10,6,9};
        int []p = {20,20,100,70,60};
        System.out.println(jobScheduling(s,e,p));
    }
}
