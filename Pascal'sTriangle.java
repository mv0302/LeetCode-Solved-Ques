//Given an integer numRows, return the first numRows of Pascal's triangle.

class Solution {
    public List<List<Integer>> generate(int numRows) {
        
        List<List<Integer>> l = new ArrayList();
        int i=0;
        while(i<numRows){
            List<Integer> temp = new ArrayList<>();
            temp.add(1);
            for(int j=1;j<i;j++){
                int row = l.get(i-1).get(j-1) + l.get(i-1).get(j);
                temp.add(row);
            }
            if(i>0){
                temp.add(1);
            }
            l.add(temp);
            i++;
        }
        return l;
        
    }
}
