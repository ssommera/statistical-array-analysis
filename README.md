# Statistical Array Analysis (Java Version)

This repository contains the **Java implementation** of the statistical array analysis project originally developed in Java.

🔗 **Python Version:** [statistical-array-analysis (Python)](https://github.com/ssommera/statistical-array-analysis-python)

---

## 🧠 Purpose

A Java command-line application for generating synthetic integer datasets and performing fundamental statistical analyses. Designed with modular, reusable methods, this project demonstrates core data-preprocessing and exploratory data analysis (EDA) workflows relevant to AI research.

---

## Overview

This program generates a fixed-size array of random integers and computes:

- Extremal values (largest, smallest) with their positions  
- Secondary extremes (2nd largest/smallest)  
- Higher-order extremes (e.g. 5th largest/smallest) via sorting  
- The true median of the dataset  

All outputs are displayed alongside positional metadata, modeling the kind of summary statistics often used in feature engineering and data quality checks.

---

## Key Features

- **Synthetic Data Generation**  
  `generateRandomArray(size, min, max)` produces reproducible random samples in a configurable range, mimicking data simulation steps in AI experiments.

- **Formatted Data Display**  
  `printDataInColumns(data, columns)` outputs values in neat columns, exemplifying clean EDA reporting.

- **Extremal Value Detection**  
  - Single-pass methods (`findLargest`, `findSmallest`) illustrate efficient min/max searches.  
  - Secondary extremes (`findSecondLargestSmallest`) show conditional filtering without full sorting.

- **Sorting-Based Analysis**  
  `findNthLargestSmallest` and `findMedian` leverage `Arrays.sort()` for accurate nth-order statistics and median extraction.

- **Position Tracking**  
  `findPosition` links each statistic back to its index in the original array, supporting traceability and interpretability.

---

## Research Relevance & AI Applications

- **Data Preprocessing Foundations**  
  Demonstrates core operations—sampling, sorting, aggregation—used to prepare and validate datasets before model training.

- **Exploratory Data Analysis (EDA)**  
  Provides a lightweight framework for summarizing key distributional properties, a critical first step in any AI project.

- **Feature Engineering Prototypes**  
  The modular methods can be extended to compute variance, skewness, or custom metrics for feature construction.

- **Synthetic Data Workflows**  
  Serves as a template for generating and inspecting synthetic datasets in simulation-based AI research.

- **Algorithmic Baselines**  
  Illustrates simple yet transparent algorithms (linear scans, bubble-sort based nth extremes) that can be compared against optimized libraries in performance studies.

---

## Code Insights: AI & Data Science Principles

- **Modularity & Reusability**  
  Each analysis step is encapsulated in a dedicated method, promoting clean interfaces and easy testing.

- **Efficiency Considerations**  
  Single-pass scans for primary extremes reduce time complexity compared to repeated sorts.

- **Statistical Correctness**  
  Sorting-based median calculation ensures mathematically sound results, critical for reproducible research.

- **Traceability**  
  Position tracking ties statistical outputs back to the raw data, supporting debugging and interpretability.

---

## Requirements

- Java Development Kit (JDK) 8 or higher  
- No external dependencies  

---

## Usage

1. **Compile** the source:
   ```bash
   javac StatisticalArrayAnalysis.java

---

## Potential Enhancements for AI Research

- Replace full sorting with **selection algorithms** (e.g., Quickselect) for nth-order statistics on large datasets  
- Integrate **streaming data** support to compute rolling statistics in real time  
- Extend to calculate **higher moments** (variance, skewness, kurtosis) for deeper distributional insights  
- Package as a **Java microservice** with a REST API for on-demand data profiling  

---

## 📫 Contact
Created by **Stephen Sommer**. Reach out or follow for more AI and data-centric tools. 

---

