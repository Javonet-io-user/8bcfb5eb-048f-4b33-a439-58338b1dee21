package jio.System.IO;

public enum WatcherChangeTypes {
  Created(1L),
  Deleted(2L),
  Changed(4L),
  Renamed(8L),
  All(15L),
  ;
  private long numVal;

  WatcherChangeTypes(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
