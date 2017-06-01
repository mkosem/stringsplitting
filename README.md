# stringsplitting

This is a science project attempting to find the quickest way to iterate over the tokens in a single character delimited string.

As of 5/31/2017, I see the following results on a system with a core i5 4570S running Windows 10 and Java 1.8.0u131.

# Run complete. Total time: 00:06:53

Benchmark                                                                                                            (STRING)  Mode  Cnt         Score         Error  Units
TokenizeBench.benchmarkIndexOfTokenize                                                                                  blarg  avgt   10   1000356.941 ±    6257.463  ns/op
TokenizeBench.benchmarkIndexOfTokenize                                             blarg.bloop.blerg.bloooooh.blop.blerrrrrrp  avgt   10  21955772.122 ±  169178.713  ns/op
TokenizeBench.benchmarkIndexOfTokenize                                            blarg.bloop.blerg.bloooooh.blop.blerrrrrrp,  avgt   10  22067222.147 ±  122428.885  ns/op
TokenizeBench.benchmarkIndexOfTokenize  blarg.bloop.blerg.bloooooh.blop.blerrrrrrp.blarg.bloop.blerg.bloooooh.blop.blerrrrrrp  avgt   10  43939803.926 ±  374360.987  ns/op
TokenizeBench.benchmarkSplit                                                                                            blarg  avgt   10   2352596.266 ±   28180.403  ns/op
TokenizeBench.benchmarkSplit                                                       blarg.bloop.blerg.bloooooh.blop.blerrrrrrp  avgt   10  36233213.550 ±   99218.222  ns/op
TokenizeBench.benchmarkSplit                                                      blarg.bloop.blerg.bloooooh.blop.blerrrrrrp,  avgt   10  37595089.107 ±   24385.015  ns/op
TokenizeBench.benchmarkSplit            blarg.bloop.blerg.bloooooh.blop.blerrrrrrp.blarg.bloop.blerg.bloooooh.blop.blerrrrrrp  avgt   10  68028955.927 ± 1973091.913  ns/op
TokenizeBench.benchmarkSplitter                                                                                         blarg  avgt   10   1120633.945 ±    4118.407  ns/op
TokenizeBench.benchmarkSplitter                                                    blarg.bloop.blerg.bloooooh.blop.blerrrrrrp  avgt   10  22035001.570 ±  100277.825  ns/op
TokenizeBench.benchmarkSplitter                                                   blarg.bloop.blerg.bloooooh.blop.blerrrrrrp,  avgt   10  22214934.849 ±  358100.427  ns/op
TokenizeBench.benchmarkSplitter         blarg.bloop.blerg.bloooooh.blop.blerrrrrrp.blarg.bloop.blerg.bloooooh.blop.blerrrrrrp  avgt   10  44151947.360 ± 1371793.970  ns/op
TokenizeBench.benchmarkSplitter2                                                                                        blarg  avgt   10    599649.980 ±    2477.461  ns/op
TokenizeBench.benchmarkSplitter2                                                   blarg.bloop.blerg.bloooooh.blop.blerrrrrrp  avgt   10  18450579.270 ±   78035.085  ns/op
TokenizeBench.benchmarkSplitter2                                                  blarg.bloop.blerg.bloooooh.blop.blerrrrrrp,  avgt   10  18581850.497 ±  505438.572  ns/op
TokenizeBench.benchmarkSplitter2        blarg.bloop.blerg.bloooooh.blop.blerrrrrrp.blarg.bloop.blerg.bloooooh.blop.blerrrrrrp  avgt   10  40413312.604 ±  311052.712  ns/op
TokenizeBench.benchmarkStringTokenizer                                                                                  blarg  avgt   10   1661730.329 ±    6767.159  ns/op
TokenizeBench.benchmarkStringTokenizer                                             blarg.bloop.blerg.bloooooh.blop.blerrrrrrp  avgt   10  26302259.488 ±  540307.260  ns/op
TokenizeBench.benchmarkStringTokenizer                                            blarg.bloop.blerg.bloooooh.blop.blerrrrrrp,  avgt   10  26671257.616 ±  160417.100  ns/op
TokenizeBench.benchmarkStringTokenizer  blarg.bloop.blerg.bloooooh.blop.blerrrrrrp.blarg.bloop.blerg.bloooooh.blop.blerrrrrrp  avgt   10  53423728.542 ±   32454.364  ns/op