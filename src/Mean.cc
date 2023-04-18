// This function calculates the mean of a vector of integers
#include <vector>

double mean(const std::vector<int>& nums) {
    int sum = 0;
    for (auto num : nums) {
        sum += num;
    }
    return static_cast<double>(sum) / nums.size();
}
