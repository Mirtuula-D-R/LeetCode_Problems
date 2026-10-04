class Solution {
    public boolean canMeasureWater(int x, int y, int z) {
        if (z > x + y) return false;
        if (z == 0) return true;
        return z % gcd(x, y) == 0;
    }
    private int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}
