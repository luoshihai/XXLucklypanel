# Android-LuckyMonkeyPanel
[![](https://jitpack.io/v/luoshihai/XXLucklypanel.svg)](https://jitpack.io/#luoshihai/XXLucklypanel)
## 简介 ##
幸运转盘，类似老虎机的抽奖活动效果。

## 截图 ##

<img src="https://github.com/jeanboydev/Android-LuckyMonkeyPanel/blob/master/resources/Screenshot_20170426-113157.jpg" width="360px" height="640px" />	<img src="https://github.com/jeanboydev/Android-LuckyMonkeyPanel/blob/master/resources/lucky.gif" width="360px" height="640px" />

- gif比较模糊可以看下视频演示

[视频演示效果](https://github.com/jeanboydev/Android-LuckyMonkeyPanel/blob/master/resources/device-2017-04-26-112438.mp4)

## 添加依赖 ##
```
    allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
    
    dependencies {
	        compile 'com.github.luoshihai:XXLucklypanel:1.0'
	}
```



## 使用 ##

开始
```Java
lucky_panel.startGame();
```

停止
```Java
int stayIndex = new Random().nextInt(8);//这里为了演示取得随机数
lucky_panel.tryToStop(stayIndex);//stayIndex 为最后停止的位置
```

## 关于我

如果对你有帮助，请 star 一下，然后 follow 我，给我增加一下分享动力，谢谢！

如果你有什么疑问或者问题，可以提交 issue 和 request，发邮件给我 1206327668@qq.com 。


## License

    Copyright 2017 jeanboy

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
