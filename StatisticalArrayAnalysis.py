import random

def generate_random_array(size, min_val, max_val):
    return [random.randint(min_val, max_val) for _ in range(size)]

def print_data_in_columns(data, columns):
    for i in range(len(data)):
        print(f"{data[i]:6d}", end="")
        if (i + 1) % columns == 0:
            print()
    print()

def find_largest(data):
    return max(data)

def find_smallest(data):
    return min(data)

def find_position(data, value):
    try:
        return data.index(value)
    except ValueError:
        return -1

def find_second_largest_smallest(data, largest, smallest):
    second_max = float('-inf')
    second_min = float('inf')
    pos2_max = -1
    pos2_min = -1

    for i, v in enumerate(data):
        if smallest < v < second_min:
            second_min = v
            pos2_min = i
        if second_max < v < largest:
            second_max = v
            pos2_max = i

    return second_max, pos2_max, second_min, pos2_min

def find_nth_largest_smallest(data, n):
    sorted_data = sorted(data)
    nth_small = sorted_data[n - 1]
    nth_large = sorted_data[-n]
    pos_small = find_position(data, nth_small)
    pos_large = find_position(data, nth_large)
    return nth_large, pos_large, nth_small, pos_small

def find_median(data):
    sorted_data = sorted(data)
    mid = len(sorted_data) // 2
    return sorted_data[mid]

def main():
    data = generate_random_array(25, 1, 250)
    
    print("Array Contents:")
    print_data_in_columns(data, 5)
    
    largest = find_largest(data)
    smallest = find_smallest(data)
    pos_largest = find_position(data, largest)
    pos_smallest = find_position(data, smallest)

    print(f"\nLargest:  {largest:3d} at index {pos_largest}")
    print(f"Smallest: {smallest:3d} at index {pos_smallest}\n")

    second_max, pos2_max, second_min, pos2_min = find_second_largest_smallest(data, largest, smallest)
    print(f"2nd Largest:  {second_max:3d} at index {pos2_max}")
    print(f"2nd Smallest: {second_min:3d} at index {pos2_min}\n")

    fifth_max, pos5_max, fifth_min, pos5_min = find_nth_largest_smallest(data, 5)
    print(f"5th Largest:  {fifth_max:3d} at index {pos5_max}")
    print(f"5th Smallest: {fifth_min:3d} at index {pos5_min}\n")

    median = find_median(data)
    pos_median = find_position(data, median)
    print(f"Median: {median:3d} at index {pos_median}")

if __name__ == "__main__":
    main()