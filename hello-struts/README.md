# hello-struts

Apache Struts 2 の HelloWorld サンプルアプリ。  
`localhost:8080/index.action` でページを表示し、Java から渡した "Hello, World!" の文字とランダムなサイコロ（⚀〜⚅）を JSP テンプレートで描画します。

## Features

* **MVC architecture** — Clear separation of model, view, and controller layers
* **Convention-over-configuration** — Annotation-based action mapping reduces XML boilerplate
* **Interceptor stack** — AOP-style pre/post request processing for cross-cutting concerns
* **OGNL expressions** — Object-Graph Navigation Language enables powerful data binding in views
* **Plugin ecosystem** — Rich plugin support for Spring, REST, Tiles, and more
* **Flexible views** — Supports JSP, Freemarker, and Velocity as view technologies

## 構成

```sh
hello-struts/
├── pom.xml
└── src/
    ├── main/
    │   ├── java/com/example/
    │   │   └── HelloAction.java         # Struts 2 アクションクラス
    │   ├── resources/
    │   │   └── struts.xml               # アクションマッピング設定
    │   └── webapp/
    │       ├── WEB-INF/
    │       │   └── web.xml              # Struts フィルタ設定
    │       ├── css/
    │       │   └── style.css            # スタイルシート
    │       └── index.jsp                # JSP テンプレート
    └── test/java/com/example/
        └── HelloActionTest.java         # JUnit 5 ユニットテスト
```

## 事前準備

| ツール | 推奨バージョン |
| ------ | -------------- |
| JDK    | 17 以上        |
| Maven  | 3.6 以上       |

バージョン確認:

```sh
java -version
mvn -version
```

## 起動方法

```sh
cd hello-struts
mvn jetty:run
```

起動後、ブラウザで以下の URL を開きます。

<http://localhost:8080/index.action>

"Hello, World!" とランダムなサイコロが表示されます。  
ページをリロードするたびにサイコロの目が変わります。

## テストの実行

```sh
cd hello-struts
mvn test
```

期待される出力:

```text
[INFO] Tests run: 3, Failures: 0, Errors: 0, Skipped: 0
[INFO] BUILD SUCCESS
```

## 停止方法

ターミナルで `Ctrl + C` を押してサーバを停止します。
