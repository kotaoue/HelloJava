# hello-spark

Spark Framework の HelloWorld サンプルアプリ。  
`localhost:4567` でページを表示し、Java から渡した "Hello, World!" の文字とランダムなサイコロ（⚀〜⚅）を Freemarker テンプレートで描画します。

## Features

* **Micro-framework** — Lightweight and unopinionated; minimal API surface lets you focus on your app logic
* **Expressive routing** — Define HTTP routes with concise Java lambda expressions
* **Embedded server** — Ships with an embedded Jetty server; no external servlet container needed
* **Template support** — Integrates with Freemarker, Velocity, Mustache, and other template engines
* **Static files** — Built-in support for serving static assets from the classpath or an external folder
* **Minimal configuration** — A working web app in just a few lines of code; no XML required

## 構成

```sh
hello-spark/
├── pom.xml
└── src/
    ├── main/
    │   ├── java/com/example/
    │   │   └── HelloWorld.java         # Spark エントリポイント・ルート定義
    │   └── resources/
    │       ├── templates/
    │       │   └── index.ftlh          # Freemarker テンプレート
    │       └── public/css/
    │           └── style.css           # スタイルシート
    └── test/java/com/example/
        └── HelloWorldTest.java         # 統合テスト
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
cd hello-spark
mvn compile exec:java -Dexec.mainClass=com.example.HelloWorld
```

または jar を作成して実行:

```sh
mvn package
java -jar target/hello-spark-0.0.1-SNAPSHOT.jar
```

起動後、ブラウザで以下の URL を開きます。

<http://localhost:4567/>

"Hello, World!" とランダムなサイコロが表示されます。  
ページをリロードするたびにサイコロの目が変わります。

## テストの実行

```sh
cd hello-spark
mvn test
```

期待される出力:

```text
[INFO] Tests run: 3, Failures: 0, Errors: 0, Skipped: 0
[INFO] BUILD SUCCESS
```

## 停止方法

ターミナルで `Ctrl + C` を押してサーバを停止します。
