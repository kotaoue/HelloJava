# spark-helloworld

Spark Framework の HelloWorld サンプルアプリ。  
`localhost:4567` でページを表示し、Java から渡した "Hello, World!" の文字とランダムなサイコロ（⚀〜⚅）を Freemarker テンプレートで描画します。

## 構成

```sh
spark-helloworld/
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
cd spark-helloworld
mvn compile exec:java -Dexec.mainClass=com.example.HelloWorld
```

または jar を作成して実行:

```sh
mvn package
java -jar target/spark-helloworld-0.0.1-SNAPSHOT.jar
```

起動後、ブラウザで以下の URL を開きます。

<http://localhost:4567/>

"Hello, World!" とランダムなサイコロが表示されます。  
ページをリロードするたびにサイコロの目が変わります。

## テストの実行

```sh
cd spark-helloworld
mvn test
```

期待される出力:

```text
[INFO] Tests run: 3, Failures: 0, Errors: 0, Skipped: 0
[INFO] BUILD SUCCESS
```

## 停止方法

ターミナルで `Ctrl + C` を押してサーバを停止します。
