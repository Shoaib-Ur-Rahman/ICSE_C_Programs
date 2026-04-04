import time
import numpy as np

print("Starting Benchmark...\n")

# CPU Test
start = time.time()
s = 0
for i in range(10_000_000):
    s += i
cpu_time = time.time() - start
print("CPU Time:", cpu_time)

# NumPy Test
start = time.time()
a = np.random.rand(1000, 1000)
b = np.dot(a, a)
numpy_time = time.time() - start
print("NumPy Time:", numpy_time)

# AI-like Test
start = time.time()
X = np.random.rand(10000, 3)
y = np.random.rand(10000)
w = np.random.rand(3)

for _ in range(1000):
    pred = X @ w
    error = pred - y
    grad = X.T @ error / len(X)
    w -= 0.01 * grad

ai_time = time.time() - start
print("AI Time:", ai_time)
