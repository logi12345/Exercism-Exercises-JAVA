class Hamming {
    int count;
    Hamming(String leftStrand, String rightStrand) {
        count=0;
       if (leftStrand.length()==rightStrand.length())
       {

           char[] leftStrandArray = leftStrand.toCharArray();
           char[] rightStrandArray = rightStrand.toCharArray();

           for (int i=0; i<leftStrand.length();i++)
           {
               if(rightStrandArray[i] != leftStrandArray[i]){
                    count++;
                }
           }
           getHammingDistance();
       }
       else
       {
            throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");
       }
    }

    int getHammingDistance() {
        return count;
    }

}
