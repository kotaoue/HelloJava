# jsf-helloworld

JavaServer Faces (JSF) の HelloWorld サンプルアプリ。  
`localhost:8080` でページを表示し、Java から渡した "Hello, World!" の文字とランダムなサイコロ（⚀〜⚅）を Facelets テンプレートで描画します。

## 構成

```sh
jsf-helloworld/
├── pom.xml
└── src/
    ├── main/
    │   ├── java/com/example/
    │   │   ├── HelloApplication.java   # Spring Boot エントリポイント
    │   │   └── HelloBean.java          # JSF Managed Bean (@Named, @RequestScoped)
    │   └── resources/
    │       ├── application.properties  # サーバポート設定 (8080)
    │       └── META-INF/resources/
    │           ├── index.xhtml         # Facelets テンプレート
    │           └── resources/css/
    │               └── style.css       # スタイルシート
    └── test/java/com/example/
        └── HelloBeanTest.java          # JUnit 5 ユニットテスト
```

## 使用技術

| 技術 | 内容 |
| ---- | ---- |
| Jakarta Faces (JSF) | Mojarra 4.0.5 — コンポーネントベース UI フレームワーク |
| Facelets | JSF の標準ビューテクノロジー（XHTML テンプレート） |
| CDI (Weld) | `@Named` / `@RequestScoped` によるマネージド Bean |
| JoinFaces | JSF を Spring Boot に統合するライブラリ |
| Spring Boot | 組み込み Tomcat でアプリを起動 |

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
cd jsf-helloworld
mvn spring-boot:run
```

起動後、ブラウザで以下の URL を開きます。

<http://localhost:8080/>

"Hello, World!" とランダムなサイコロが表示されます。  
ページをリロードするたびにサイコロの目が変わります。

## テストの実行

```sh
cd jsf-helloworld
mvn test
```

期待される出力:

```text
[INFO] Tests run: 3, Failures: 0, Errors: 0, Skipped: 0
[INFO] BUILD SUCCESS
```

## 停止方法

ターミナルで `Ctrl + C` を押してサーバを停止します。
