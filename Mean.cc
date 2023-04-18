#include <vector>

double mean(const std::vector<int>& nums) {
    int sum = 0;
    for (auto num : nums) {
        sum += num;
    }
    return static_cast<double>(sum) / nums.size();
}