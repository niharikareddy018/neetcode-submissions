class DynamicArray {
List<Integer> list=new ArrayList<>();
    int capacity;
    public DynamicArray(int capacity) {
        if(capacity>0)
         this.capacity=capacity;
    }

    public int get(int i) {
      if(i>=0 && i < list.size()){
        return list.get(i);
      }
      return 0;
    }

    public void set(int i, int n) {
        if(i>=0 && i < list.size()){
            list.set(i,n);
        }
    }

    public void pushback(int n) {
        if(list.size()==capacity){
            resize();
        }
        list.add(n);
    }

    public int popback() {
      if(!list.isEmpty()){
        return list.remove(list.size()-1);
      }
      return 0;
    }

    private void resize() {
       capacity=2*capacity;
    }

    public int getSize() {
       return list.size();
    }

    public int getCapacity() {
        return capacity;
    }
}
