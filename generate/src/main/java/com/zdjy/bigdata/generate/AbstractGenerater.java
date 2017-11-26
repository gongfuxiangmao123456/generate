package com.zdjy.bigdata.generate;

import java.util.Random;

/**
 * 生成器抽象类
 * 
 * 所有的自定义生成器都得集成这个超类，并且泛型需要指定返回值的类型
 * 
 * @author david
 * @create 2017年11月19日 上午11:29:27
 * @param <T>
 */
public interface AbstractGenerater<T> {
	//随机种子常量，在接口中定义一次，其他的子类直接可以使用
	Random RANDOM=new Random();
	public T generate();
}
