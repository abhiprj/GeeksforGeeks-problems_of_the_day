class KnapsackComparator implements Comparator<Item> {
    @Override
    public int compare(Item a, Item b) {
        
        // sort in increasing order
        
        double r1 = (double)(a.value) / (double)(a.weight);
        double r2 = (double)(b.value) / (double)(b.weight);
        if(r1 < r2) return 1;
        else if(r1 > r2) return -1;
        else return 0;
        /*
            In above conditions elseif and else statement are treated differently.
            -1 : don't swap | value are UNEQUAL
             0 : don't swap | value are EQUAL 
             1 : swap 
        */
    }
}

class Solution
{
    //Function to get the maximum total value in the knapsack.
    double fractionalKnapsack(int W, Item arr[], int n) 
    {
        // Create an instance of the KnapsackComparator class.
        KnapsackComparator com = new KnapsackComparator();
        // sort the item in respect of increasing order value per weight 
        Arrays.sort(arr, com);
        
        
        int currWeight = 0;
        /* 
            finalValue should be double type because 
            let w = 30, v = 18
            and let we need only 23 weight so for w = 23,
            v = (18/30) * 23 = 13.8
        */
        double finalValue = 0.0;
        
        for(int i = 0; i < n; i++) {
            
            if(currWeight + arr[i].weight <= W) {
                currWeight += arr[i].weight;
                finalValue += arr[i].value;
            }
            else {
                int weightRequired = W - currWeight;
                finalValue += ((double)(arr[i].value) / (double)(arr[i].weight)) * (double)weightRequired;
                break;
                // we will break from for loop after we get all the weight required
            }
        }
        return finalValue;
    }
}
