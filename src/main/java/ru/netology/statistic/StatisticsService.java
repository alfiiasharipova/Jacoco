package ru.netology.statistic;

public class StatisticsService {
  /**
   * Calculate index of max income
   *
   * @param incomes - array of incomes
   * @return - index of first max value
   */
  public long findMax(long[] incomes) {
    long current_max_index = 0;
    Number[] arr = new Integer[10];
    long current_max = incomes[0];
    int count = 0;
    for (long income : incomes) {
      if (current_max < income) {
        current_max = income;
        current_max_index = count;
      }
      count++;
    }
    return current_max_index;
  }
}
