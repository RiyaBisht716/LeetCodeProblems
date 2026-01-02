class Solution {
public:
    long long minimumTime(vector<int>& time, int totalTrips) {
        long long left = 1;
        long long right =(long long)*max_element(time.begin(),time.end())* totalTrips;

        while(left<right){
            long long mid =left+(right-left)/2;
            if(canComplete(time,totalTrips,mid)){
                right =mid;
            }
            else{
                left = mid +1;
            }
        }
        return left;

    }

    private:
    bool canComplete(vector<int>& time, int totalTrips, long long givenTime){
        long long trips =0;
        for(int t:time){
            trips+= givenTime/t;
            if(trips>= totalTrips){
                return true;
            }
        }
        return false;
    }
};