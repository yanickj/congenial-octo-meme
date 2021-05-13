package com.example.starter;

import io.vertx.codegen.annotations.GenIgnore;
import io.vertx.codegen.annotations.VertxGen;

import java.time.ZonedDateTime;

@VertxGen
public interface FooInterface {
  public void foo(ZonedDateTime t);

  @GenIgnore
  public static String serialize(ZonedDateTime date) {
    return date.toString();
  }
  @GenIgnore
  public static ZonedDateTime deserialize(String s) {
    return ZonedDateTime.parse(s);
  }
}
