# InkPageIndicator

[![Android Arsenal](https://img.shields.io/badge/Android%20Arsenal-InkPageIndicator-green.svg?style=true)](https://android-arsenal.com/details/1/2932) 
[![Platform](https://img.shields.io/badge/Platform-Android-green.svg)](http://developer.android.com/index.html)
[![API](https://img.shields.io/badge/API-14%2B-brightgreen.svg)](https://android-arsenal.com/api?level=14)
[ ![Download](https://api.bintray.com/packages/davidpacioianu/maven/ink-page-indicator/images/download.svg) ](https://bintray.com/davidpacioianu/maven/ink-page-indicator/_latestVersion)
[![GitHub license](https://img.shields.io/badge/license-Apache%202-blue.svg)](https://raw.githubusercontent.com/DavidPacioianu/InkPageIndicator/master/LICENSE) 

InkPageIndicator created by @nickbutcher for Plaid https://github.com/nickbutcher/plaid and backported by me for API 14+ (4.0+)

<h3>InkPageIndicator Preview</h3>

![](http://i.imgur.com/fRgDXWK.gif)

# Usage

```gradle
dependencies {
    implementation 'com.pacioianu.david:ink-page-indicator:1.3.0'
}
```

```xml
<com.pixelcan.inkpageindicator.InkPageIndicator
  android:id="@+id/indicator"
  android:layout_width="match_parent"
  android:layout_height="wrap_content"/>
```
 and 
```java
InkPageIndicator inkPageIndicator = (InkPageIndicator) findViewById(R.id.indicator);
inkPageIndicator.setViewPager(viewPager);
```

#### Custom attributes:
```xml
<com.pixelcan.inkpageindicator.InkPageIndicator
  android:id="@+id/indicator"
  android:layout_width="match_parent"
  android:layout_height="wrap_content"
  app:ipi_dotDiameter="8dp"
  app:ipi_dotGap="8dp"
  app:ipi_animationDuration="320"
  app:ipi_pageIndicatorColor="@android:color/darker_gray"
  app:ipi_currentPageIndicatorColor="@android:color/black"/>
```
> **Note:** Starting from version 1.3.0 we added the **_ipi__** prefix to the name of the attributes.

## Apps using the InkPageIndicator
(feel free to send me your project)

Icon | Application
------------ | -------------
<img src="https://goo.gl/QrCvNu" width="48" height="48" /> | [Udacity](https://play.google.com/store/apps/details?id=com.udacity.android) 
<img src="https://goo.gl/4i6lVV" width="48" height="48" /> | [Stickchat](https://play.google.com/store/apps/details?id=com.timmystudios.stickchat) 
<img src="https://goo.gl/ZtSdKQ" width="48" height="48" /> | [Wally](https://play.google.com/store/apps/details?id=com.brocoli.wally)
<img src="https://goo.gl/MZRSab" width="48" height="48" /> | [Material-Onboarding](https://github.com/Vexigon/Material-Onboarding)
<img src="https://goo.gl/PNN4yC" width="48" height="48" /> | [Frame](https://play.google.com/store/apps/details?id=com.cwfei.frame) 
<img src="https://goo.gl/wpVss6" width="48" height="48" /> | [Touch for Facebook](https://play.google.com/store/apps/details?id=com.fa.touch.free) 
<img src="https://lh3.googleusercontent.com/ySzFwzAuM5bRK0heUqCF_2_D1qL9t7Hrmz7nebWGg6xmIa7afKl_3hQgIYTmV4REA8E=s180-rw" width="48" height="48" /> | [Google IO 2018](https://play.google.com/store/apps/details?id=com.google.samples.apps.iosched&hl=it) 


License
--------

    Copyright 2018 David Păcioianu

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
