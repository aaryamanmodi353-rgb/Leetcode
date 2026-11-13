class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        int left = m - 1;
        int right = n - 1;
        
        if(nums1.length == 0 && nums2.length == 0){
            return;
        }

    
        int i = 1;
        while(left >= 0 && right >= 0){
            
            if(nums1[left] > nums2[right]){
                nums1[m + n - i] = nums1[left];
                i++;
                left--;
            
            }
            else{
                nums1[m + n - i] = nums2[right];
                i++;
                right--;
            }
           
        }

        while(right >= 0){
            nums1[m + n - i] = nums2[right];
            right--;
            i++;
        }
        
    
    

        }

        

      
      
        
    }
