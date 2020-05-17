import math
A,B,H,M = map(int,input().split())
H_pos = H/12 + M/720
M_pos = M/60
deg = 360*(H_pos-M_pos)
if deg > 180: deg = 360-deg
rad = math.radians(deg)
co = math.cos(rad)
print("{:.9f}".format(math.sqrt(A**2+B**2-2*A*B*co)))