<h2><a href="https://www.codechef.com/problems/FAVOURITENUM">Favourite Numbers</a></h2><h4>Difficulty: </h4><ul>
<li>Alice likes numbers which are even, and are a multiple of 7.</li>
<li>Bob likes numbers which are odd, and are a multiple of 9.</li>
</ul><p>Alice, Bob, and Charlie find a number <span class="math math-inline"><span class="katex"><span class="katex-mathml"><math xmlns="http://www.w3.org/1998/Math/MathML"><semantics><mrow><mi>A</mi></mrow><annotation encoding="application/x-tex">A</annotation></semantics></math></span><span class="katex-html" aria-hidden="true"><span class="base"><span class="strut" style="height: 0.6833em;"></span><span class="mord mathnormal">A</span></span></span></span></span>.</p><ul>
<li>If Alice likes <span class="math math-inline"><span class="katex"><span class="katex-mathml"><math xmlns="http://www.w3.org/1998/Math/MathML"><semantics><mrow><mi>A</mi></mrow><annotation encoding="application/x-tex">A</annotation></semantics></math></span><span class="katex-html" aria-hidden="true"><span class="base"><span class="strut" style="height: 0.6833em;"></span><span class="mord mathnormal">A</span></span></span></span></span>, Alice takes home the number.</li>
<li>If Bob likes <span class="math math-inline"><span class="katex"><span class="katex-mathml"><math xmlns="http://www.w3.org/1998/Math/MathML"><semantics><mrow><mi>A</mi></mrow><annotation encoding="application/x-tex">A</annotation></semantics></math></span><span class="katex-html" aria-hidden="true"><span class="base"><span class="strut" style="height: 0.6833em;"></span><span class="mord mathnormal">A</span></span></span></span></span>, Bob takes home the number.</li>
<li>If both Alice and Bob don't like the number, Charlie takes it home.</li>
</ul><p>Given <span class="math math-inline"><span class="katex"><span class="katex-mathml"><math xmlns="http://www.w3.org/1998/Math/MathML"><semantics><mrow><mi>A</mi></mrow><annotation encoding="application/x-tex">A</annotation></semantics></math></span><span class="katex-html" aria-hidden="true"><span class="base"><span class="strut" style="height: 0.6833em;"></span><span class="mord mathnormal">A</span></span></span></span></span>, find who takes it home.</p><p><strong>Note:</strong> You can prove that there is no integer <span class="math math-inline"><span class="katex"><span class="katex-mathml"><math xmlns="http://www.w3.org/1998/Math/MathML"><semantics><mrow><mi>A</mi></mrow><annotation encoding="application/x-tex">A</annotation></semantics></math></span><span class="katex-html" aria-hidden="true"><span class="base"><span class="strut" style="height: 0.6833em;"></span><span class="mord mathnormal">A</span></span></span></span></span> such that both Alice and Bob like it.</p><div class="notranslate">
<h3>Input Format</h3>
<ul>
<li>The first line of input will contain a single integer <span class="math math-inline"><span class="katex"><span class="katex-mathml"><math xmlns="http://www.w3.org/1998/Math/MathML"><semantics><mrow><mi>T</mi></mrow><annotation encoding="application/x-tex">T</annotation></semantics></math></span><span class="katex-html" aria-hidden="true"><span class="base"><span class="strut" style="height: 0.6833em;"></span><span class="mord mathnormal" style="margin-right: 0.13889em;">T</span></span></span></span></span>, denoting the number of test cases.</li>
<li>Each test case consists of a single integer, <span class="math math-inline"><span class="katex"><span class="katex-mathml"><math xmlns="http://www.w3.org/1998/Math/MathML"><semantics><mrow><mi>A</mi></mrow><annotation encoding="application/x-tex">A</annotation></semantics></math></span><span class="katex-html" aria-hidden="true"><span class="base"><span class="strut" style="height: 0.6833em;"></span><span class="mord mathnormal">A</span></span></span></span></span>.</li>
</ul>
</div><div class="notranslate">
<h3>Output Format</h3>
<p>For each test case, output on a new line who takes the number home - "Alice", "Bob", or "Charlie".</p>
<p>You may print each character in uppercase or lowercase. For example, <code>Alice</code>, <code>alice</code>, <code>aLiCe</code>, and <code>ALICE</code> are all considered identical.</p>
</div><h3 class="notranslate">Constraints</h3><div class="_html_code__block_1llav_174 notranslate">
<ul>
<li><span class="math math-inline"><span class="katex"><span class="katex-mathml"><math xmlns="http://www.w3.org/1998/Math/MathML"><semantics><mrow><mn>1</mn><mo>≤</mo><mi>T</mi><mo>≤</mo><mn>100</mn></mrow><annotation encoding="application/x-tex">1 \leq T \leq 100</annotation></semantics></math></span><span class="katex-html" aria-hidden="true"><span class="base"><span class="strut" style="height: 0.7804em; vertical-align: -0.136em;"></span><span class="mord">1</span><span class="mspace" style="margin-right: 0.2778em;"></span><span class="mrel">≤</span><span class="mspace" style="margin-right: 0.2778em;"></span></span><span class="base"><span class="strut" style="height: 0.8193em; vertical-align: -0.136em;"></span><span class="mord mathnormal" style="margin-right: 0.13889em;">T</span><span class="mspace" style="margin-right: 0.2778em;"></span><span class="mrel">≤</span><span class="mspace" style="margin-right: 0.2778em;"></span></span><span class="base"><span class="strut" style="height: 0.6444em;"></span><span class="mord">100</span></span></span></span></span></li>
<li><span class="math math-inline"><span class="katex"><span class="katex-mathml"><math xmlns="http://www.w3.org/1998/Math/MathML"><semantics><mrow><mn>1</mn><mo>≤</mo><mi>A</mi><mo>≤</mo><mn>1000</mn></mrow><annotation encoding="application/x-tex">1 \leq A \leq 1000</annotation></semantics></math></span><span class="katex-html" aria-hidden="true"><span class="base"><span class="strut" style="height: 0.7804em; vertical-align: -0.136em;"></span><span class="mord">1</span><span class="mspace" style="margin-right: 0.2778em;"></span><span class="mrel">≤</span><span class="mspace" style="margin-right: 0.2778em;"></span></span><span class="base"><span class="strut" style="height: 0.8193em; vertical-align: -0.136em;"></span><span class="mord mathnormal">A</span><span class="mspace" style="margin-right: 0.2778em;"></span><span class="mrel">≤</span><span class="mspace" style="margin-right: 0.2778em;"></span></span><span class="base"><span class="strut" style="height: 0.6444em;"></span><span class="mord">1000</span></span></span></span></span></li>
</ul>
</div><h3 class="notranslate">Sample 1:</h3><div class="_input_output__table_1llav_186 notranslate"><div class="_text_copy__container_1llav_190"><div class="_text_copy_1llav_190 _input_top__box_1llav_203"><span>Input</span><div aria-label="Copy to clipboard" class="undefined css-1eiukdk" style="pointer-events: all;"><span class="_icon__box_10bs7_2 _dark_10bs7_27 undefined"><i class="_copy__icon_10bs7_14"></i></span></div></div><div class="_text_copy_1llav_190 _ouput_top__box_1llav_206"><span>Output</span><div aria-label="Copy to clipboard" class="undefined css-1eiukdk" style="pointer-events: all;"><span class="_icon__box_10bs7_2 _dark_10bs7_27 undefined"><i class="_copy__icon_10bs7_14"></i></span></div></div></div><div class="_values__container_1llav_209"><div class="_values_1llav_209"><pre>8
7
14
21
18
27
63
126
8
</pre></div><div class="_values_1llav_209"><pre>Charlie
Alice
Charlie
Charlie
Bob
Bob
Alice
Charlie
</pre></div></div></div><h3 class="notranslate">Explanation:</h3><div class="notranslate">
<p><strong>Testcase 1:</strong> 7 is not even, hence Alice doesn't like it. It is odd, but isn't a multiple of 9. Hence Bob doesn't like it. Therefore, Charlie takes it home.</p>
<p><strong>Testcase 2:</strong> 14 is even and a multiple of 7. Therefore, Alice likes it and takes it home.</p>
<p><strong>Testcase 3:</strong> 21 is not even, hence Alice doesn't like it. It is odd, but isn't a multiple of 9. Hence Bob doesn't like it. Therefore, Charlie takes it home.</p>
<p><strong>Testcase 4:</strong> 18 is even but not a multiple of 7, hence Alice doesn't like it. It is not odd, and hence Bob doesn't like it. Therefore, Charlie takes it home.</p>
<p><strong>Testcase 5:</strong> 27 is odd and a multiple of 9. Therefore, Bob likes it and takes it home.</p>
<p><strong>Testcase 6:</strong> 63 is odd and a multiple of 9. Therefore, Bob likes it and takes it home.</p>
<p><strong>Testcase 7:</strong> 126 is even and a multiple of 7. Therefore, Alice likes it and takes it home.</p>
<p><strong>Testcase 8:</strong> 8 is even but not a multiple of 7, hence Alice doesn't like it. It is not odd, and hence Bob doesn't like it. Therefore, Charlie takes it home.</p>
</div><div></div>