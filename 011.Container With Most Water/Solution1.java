class Solution {
    public int maxArea(int[] height) {
        if(height==null||height.length==1){
            return 0;
        }
        List<Point> pointList = new ArrayList<>();
        int maxHeight = height[0];
        int maxAera = 0;
        pointList.add(new Point(0,height[0]));
        for(int i =1;i<height.length ;i++){
            int iheight = height[i];
            for(Point point :pointList){
                int area = (i-point.x)*Math.min(point.y,iheight);
                maxAera = maxAera<area?area:maxAera;
            }
            if(maxHeight<iheight){
                maxHeight = iheight;
                pointList.add(new Point(i,iheight));
            }
        }
        return maxAera;
    }
    
    private class Point{
        Integer x;
        Integer y;
        Point(int x,int y){
            this.x=x;
            this.y=y;
        }
    }
}
